package by.epam.training.jwd.task02.dao;

import java.util.List;

import by.epam.training.jwd.task02.dao.util.search_regex_creator.CriteriaSearchRegexCreator;
import by.epam.training.jwd.task02.entity.appliance.Appliance;
import by.epam.training.jwd.task02.entity.criteria.Criteria;

public interface ApplianceDAO {

	<E> List<Appliance> find(Criteria<E> criteria, CriteriaSearchRegexCreator regexCreator);
}
