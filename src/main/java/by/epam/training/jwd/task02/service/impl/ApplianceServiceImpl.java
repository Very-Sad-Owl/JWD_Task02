package by.epam.training.jwd.task02.service.impl;

import by.epam.training.jwd.task02.dao.ApplianceDAO;
import by.epam.training.jwd.task02.dao.DAOFactory;
import by.epam.training.jwd.task02.service.ApplianceService;
import by.epam.training.jwd.task02.dao.util.search_regex_creator.CriteriaSearchRegexCreator;
import by.epam.training.jwd.task02.entity.appliance.Appliance;
import by.epam.training.jwd.task02.entity.criteria.Criteria;
import by.epam.training.jwd.task02.service.util.CriteriaValidator;

import java.util.List;


public class ApplianceServiceImpl implements ApplianceService {

    public <E> List<Appliance> find(Criteria<E> criteria){
        // вернуть старый валидатор?🤔
        if (!CriteriaValidator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();
        CriteriaSearchRegexCreator regexCreator = new CriteriaSearchRegexCreator();

        return applianceDAO.find(criteria, regexCreator);
    }
}

