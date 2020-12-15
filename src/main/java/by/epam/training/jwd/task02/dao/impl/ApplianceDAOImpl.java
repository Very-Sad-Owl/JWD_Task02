package by.epam.training.jwd.task02.dao.impl;

import by.epam.training.jwd.task02.dao.ApplianceDAO;
import by.epam.training.jwd.task02.dao.util.search_regex_creator.CriteriaSearchRegexCreator;
import by.epam.training.jwd.task02.dao.util.string_splitter.FieldsRetriever;
import by.epam.training.jwd.task02.entity.AppliancesFactory;
import by.epam.training.jwd.task02.entity.appliance.Appliance;
import by.epam.training.jwd.task02.entity.criteria.Criteria;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// исправить мини-ад с try..catch и раскидать всё по методам
public class ApplianceDAOImpl implements ApplianceDAO {

    public <E> List<Appliance> find(Criteria<E> criteria, CriteriaSearchRegexCreator regexCreator) {


        String regex = regexCreator.createRegex(criteria);
        Pattern pattern = Pattern.compile(regex);

        //вынести в интерфейс как константу
        URL resource = ApplianceDAOImpl.class.getResource("/appliances_db.txt");
        File file = null;//исправить

        //вынести куда-нибудь
        try {
            file = Paths.get(resource.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // тоже сделать покрасивше
        List<String> matchedDevices = null;
        try {
            matchedDevices = findRegexMatches(file, pattern);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // попил строки
        List<String> entitiesList = FieldsRetriever.retrieveFields(matchedDevices);

        AppliancesFactory appliancesFactory = AppliancesFactory.getInstance();

        return appliancesFactory.getAppliance(entitiesList);
    }

    // найти в файле строки, соответсвующие рег выражению
    private List<String> findRegexMatches(File source, Pattern pattern) throws IOException {
        ArrayList<String> devicesList = new ArrayList<>();
        Matcher matcher;

        FileReader fileReader = new FileReader(source.getAbsolutePath());
        BufferedReader br = new BufferedReader(fileReader);
        while (br.ready()) {
            String line = br.readLine();
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                devicesList.add(matcher.group());
            }
        }

        return devicesList;
    }
}
