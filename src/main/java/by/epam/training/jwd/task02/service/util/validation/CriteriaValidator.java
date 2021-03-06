package by.epam.training.jwd.task02.service.util.validation;

import by.epam.training.jwd.task02.entity.criteria.Criteria;

import java.util.Map;

public class CriteriaValidator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {

        // null или пустая
        if (criteria == null || criteria.getCriteria().size() == 0) {
            return false;
        }

        // какой-то из ключей null или пустой
        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
            if (entry.getKey() == null || entry.getKey().toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}

