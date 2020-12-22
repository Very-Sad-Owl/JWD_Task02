package by.epam.training.jwd.task02.dao.util;

import java.util.ArrayList;
import java.util.List;

public class FieldsRetriever {

    private FieldsRetriever() {}

    public static List<String> retrieveFields(List<String> productList) {
        List<String> productData = new ArrayList<>();
        for (String product : productList) {
            String[] allFields = product.split("[:,\\s]");
            for (String field : allFields) {
                if (field != null && !field.isEmpty()) {
                    productData.add(field);
                }
            }
        }
        return productData;
    }
}
