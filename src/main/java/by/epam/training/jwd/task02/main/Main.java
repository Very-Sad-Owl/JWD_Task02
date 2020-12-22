package by.epam.training.jwd.task02.main;

import by.epam.training.jwd.task02.entity.appliance.Appliance;
import by.epam.training.jwd.task02.entity.criteria.Criteria;
import by.epam.training.jwd.task02.entity.criteria.SearchCriteria;
import by.epam.training.jwd.task02.service.ApplianceService;
import by.epam.training.jwd.task02.service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        ////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>();
        criteriaOven.add(SearchCriteria.Oven.CAPACITY, 32);

        appliances = service.find(criteriaOven);
        PrintApplianceInfo.print(appliances, criteriaOven);

        ////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria<>();
        criteriaOven.add(SearchCriteria.Oven.HEIGHT, 40);
        criteriaOven.add(SearchCriteria.Oven.DEPTH, 60);

        appliances = service.find(criteriaOven);
        PrintApplianceInfo.print(appliances, criteriaOven);

        //////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.TabletPC> criteriaTabletPC = new Criteria<>();
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR, "BLUE");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM, 8000);

        appliances = service.find(criteriaTabletPC);
        PrintApplianceInfo.print(appliances, criteriaTabletPC);

        /////////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.Refrigerator> criteriaFridge = new Criteria<>();
        criteriaFridge.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION, 200);
        criteriaFridge.add(SearchCriteria.Refrigerator.HEIGHT, 150);

        appliances = service.find(criteriaFridge);
        PrintApplianceInfo.print(appliances, criteriaFridge);
    }
}
