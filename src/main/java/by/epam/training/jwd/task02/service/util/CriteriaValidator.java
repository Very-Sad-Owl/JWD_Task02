package by.epam.training.jwd.task02.service.util;

import by.epam.training.jwd.task02.entity.criteria.Criteria;

import java.util.Map;

public class CriteriaValidator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {

        if (criteria == null || criteria.getCriteria().size() == 0) {
            return false;
        }

        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
            if (entry.getKey() == null) {
                return false;
            }
        }
        return true;
    }
}

