package by.epam.training.jwd.task02.dao.util.search_regex_creator;

import by.epam.training.jwd.task02.entity.criteria.Criteria;

public class CriteriaSearchRegexCreator {

    public <E> String createRegex(Criteria<E> criteria) {
        StringBuilder resultRegex;
        resultRegex = new StringBuilder();
        // regex construction

        return resultRegex.toString();
    }

    private <E> boolean checkCriteriaIsValid(Criteria<E> criteria){
        //check nor criteria nor value is null or empty
        return true;
    }
}
