package by.epam.training.jwd.task02.dao.util;

import by.epam.training.jwd.task02.entity.criteria.Criteria;

import java.util.Iterator;
import java.util.Map;

public class CriteriaSearchRegexCreator {

    // удалить пары с пустым значением
    private <E> void checkCriteriaIsValid(Criteria<E> criteria){
        //проверяем, есть ли пусные или null значния в каждой паре
        Iterator<Map.Entry<E, Object>> iter = criteria.getCriteria().entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<E, Object> pair = iter.next();
            if (pair.getValue() == null || pair.getValue().toString().isEmpty()) {
                iter.remove();
            }
        }
    }

    private <E> boolean getProductNameRegex(Criteria<E> criteria, int size, StringBuilder regex){
        for (Map.Entry<E, Object> pair : criteria.getCriteria().entrySet()) {
            // определяем тип продукта
            String appType = pair.getKey().getClass().getSimpleName();
            // характеристику
            String characteristic = pair.getKey().toString();
            // если критерий всего один, то сразу строим соответствующее регулярное выражение
            if (size == 1) {
                regex.append(appType).append(" :.+?").append(characteristic).append("=").append(pair.getValue()).append("[,;].+");
                return true;
            }
            // если нет, то создаёт первую часть рег выражения, определяющую тип продукта
            else {
                regex.append(appType).append(" :.+?");
                break;
            }
        }
        return false;
    }

    private <E> void getCriteriasRegex(Criteria<E> criteria, int size, StringBuilder regex){
        StringBuilder repeatedPart = new StringBuilder("((");
        int counter = 1;
        for (Map.Entry<E, Object> pair : criteria.getCriteria().entrySet()) {

            String characteristic = pair.getKey().toString();
            String value = pair.getValue() + "";
            // на последнем элемнте "звкрываем" строку
            if (counter == size) {
                repeatedPart.append("(")
                        .append(characteristic)
                        .append("=").append(value)
                        .append("))[,;\\s].+?)");
            } else {
                repeatedPart
                        .append("(")
                        .append(characteristic)
                        .append("=")
                        .append(pair.getValue())
                        .append(")|");
            }
            counter++;
        }
        //добавляем критерии
        regex.append(repeatedPart)
                .append("{")
                .append(size - 1)
                .append("}");
        //вырезаем с конца кусок рег выражения с квалификатором повторения
        regex.append(repeatedPart.substring(1, repeatedPart.length() - 2));
    }

    public <E> String createRegex(Criteria<E> criteria) {
        StringBuilder regex = new StringBuilder();
        // если есть пары с пустым значением, удаляем их
        checkCriteriaIsValid(criteria);
        int size = criteria.getCriteria().size();
        // метод добавляет в результирующее рег выражение часть с названием продукта
        // и, если задана одна характеристика, сразу коснтруирует готовое рег выражение, возвращая true
        // если возвращено true, можно заканчивать работу метода-конструктора
        if (getProductNameRegex(criteria, size, regex)) return regex.toString();
        // если задано больше одного критерия, создаём дальше строим для них рег выражение
        getCriteriasRegex(criteria, size, regex);

        return regex.toString();
    }
}
