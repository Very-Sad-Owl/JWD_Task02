package by.epam.training.jwd.task02.dao.impl;

import by.epam.training.jwd.task02.dao.ApplianceDAO;
import by.epam.training.jwd.task02.dao.util.CriteriaSearchRegexCreator;
import by.epam.training.jwd.task02.entity.AppliancesFactory;
import by.epam.training.jwd.task02.entity.appliance.Appliance;
import by.epam.training.jwd.task02.entity.criteria.Criteria;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.training.jwd.task02.dao.util.FieldsRetriever.*;

public class ApplianceDAOImpl implements ApplianceDAO {
    private final static String DB_NAME = "appliances_db.txt";
    private final static String DB_PATH = System.getProperty("user.dir") + "/";

    public <E> List<Appliance> find(Criteria<E> criteria, CriteriaSearchRegexCreator regexCreator) {

        // регулярное выражение для поиска подходящих строк в файле бд
        String regex = regexCreator.createRegex(criteria);
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        File file = new File(DB_PATH + DB_NAME);

        // список совпадений
        List<String> matchedRows = findRegexMatches(file, pattern);

        // преобразуем полученную строку в список критериев и их занчений
        List<String> characteristicsList = retrieveFields(matchedRows);

        AppliancesFactory appliancesFactory = AppliancesFactory.getInstance();

        return appliancesFactory.getAppliance(characteristicsList);
    }

    // найти в файле строки, соответсвующие рег выражению
    private List<String> findRegexMatches(File database, Pattern pattern) {
        ArrayList<String> appliances = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(database.getAbsolutePath());
            BufferedReader br = new BufferedReader(fileReader);
            Matcher matcher;
            while (br.ready()) {
                String line = br.readLine();
                matcher = pattern.matcher(line);
                if (matcher.find()) {
                    appliances.add(matcher.group());
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return appliances;
    }
}
