package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.txtSourceImpl.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;



public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public  <E> Appliance find(Criteria<E> criteria)  {
		Appliance appliance = null;
		String applianceName = criteria.getApplianceName();

		if(applianceName.equalsIgnoreCase("Oven")){
			appliance =  new OvenTxtDAOImpl().find(criteria);
		}else if(applianceName.equalsIgnoreCase("Laptop")){
			appliance = new LaptopTxtDaoImpl().find(criteria);
		}else if(applianceName.equalsIgnoreCase("Refrigerator")){
			appliance = new RefrigeratorTxtDAOImpl().find(criteria);
		}else if(applianceName.equalsIgnoreCase("TabletPC")){
			appliance = new TablePCTxtDAOImpl().find(criteria);
		}else if(applianceName.equalsIgnoreCase("Speakers")){
			appliance = new SpeakersTxtDAOImpl().find(criteria);
		}else if(applianceName.equalsIgnoreCase("VacuumCleaner")){
			appliance  = new VacuumTxtDAOImpl().find(criteria);
		}

		return appliance;
	}

}




