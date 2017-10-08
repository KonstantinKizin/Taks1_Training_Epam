package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;




public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.CAPACITY, 33);
		criteriaOven.add(Oven.HEIGHT , 45);
		criteriaOven.add(Oven.WEIGHT , 12);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.HEIGHT, 40);
		criteriaOven.add(Oven.DEPTH, 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);


		//////////////////////////////////////////////////////////////////

		Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>();
		criteriaLaptop.add(Laptop.OS , "Windows");
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY , 1);

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<Refrigerator> criteriaRefrigirator = new Criteria<Refrigerator>();
		criteriaRefrigirator.add(Refrigerator.POWER_CONSUMPTION , 100);

		appliance = service.find(criteriaRefrigirator);

		PrintApplianceInfo.print(appliance);


		Criteria<Speakers> criteriaSpeaker = new Criteria<Speakers>();
		criteriaSpeaker.add(Speakers.NUMBER_OF_SPEAKERS , 2);
		criteriaSpeaker.add(Speakers.FREQUENCY_RANGE,  "2-4");

		appliance = service.find(criteriaSpeaker);

		PrintApplianceInfo.print(appliance);



		//////////////////////////////////////////////////////////////////

		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.add(TabletPC.COLOR, "green");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 16);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 16000);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);



		//////////////////////////////////////////////////////////////////
		Criteria<SearchCriteria.VacuumCleaner> criteriaVacuum = new Criteria<SearchCriteria.VacuumCleaner>();
		criteriaVacuum.add(SearchCriteria.VacuumCleaner.FILTER_TYPE , "A");
		criteriaVacuum.add(SearchCriteria.VacuumCleaner.BAG_TYPE , "XXX");


		appliance = service.find(criteriaVacuum);

		PrintApplianceInfo.print(appliance);








	}

}
