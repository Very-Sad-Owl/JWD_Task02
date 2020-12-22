package by.epam.training.jwd.task02.main;

import by.epam.training.jwd.task02.entity.appliance.Appliance;
import by.epam.training.jwd.task02.entity.criteria.Criteria;

import java.util.List;

class PrintApplianceInfo {

    static <E> void print(List<Appliance> appliances, Criteria<E> criteria) {
        if (appliances == null) {
            System.out.printf("Invalid criteria\n%s\n", criteria.toString());
        } else if (appliances.size() == 0) {
            System.out.printf("There is no any product with such criteria :c\n%s\n", criteria);
        } else {
            System.out.printf("Product %s with following characteristics fit the given criteria!\n%s\n",
                    appliances.get(0).getClass().getSimpleName(), criteria);
        }
    }

}
