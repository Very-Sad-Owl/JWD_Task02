package by.epam.training.jwd.task02.service;

import by.epam.training.jwd.task02.entity.appliance.Appliance;
import by.epam.training.jwd.task02.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {	
	
	<E> List<Appliance> find(Criteria<E> criteria);
	
}
