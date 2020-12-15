package by.epam.training.jwd.task02.dao.util.string_splitter;

import java.util.ArrayList;
import java.util.List;

public class FieldsRetriever {

    private FieldsRetriever() {}

    public static List<String> retrieveFields(List<String> goodsList) {
        List<String> fieldsAndAttributes = new ArrayList<>();
        for (String good : goodsList) {
            String[] fields = good.split("[( : )(, )(;)\\s]");//🤔🤔🤔🤔
            for (String field : fields) {
                if (field != null && !field.equals("")) {
                    fieldsAndAttributes.add(field);
                }
            }
        }
        return fieldsAndAttributes;
    }
}
