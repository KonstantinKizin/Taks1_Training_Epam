package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		Map<E , Object> criterian = criteria.getCriteria();
		String applianceName = criteria.getApplianceName();

		if(applianceName.equalsIgnoreCase("Oven")){
			return checkOvenCriterias((Map<Object, Object>) criterian);
		}else if(applianceName.equals("Laptop")){
			return checkLaptopCriterias((Map<Object, Object>) criterian);
		}else if(applianceName.equals("Refrigerator")){
			return checkRefrigeratorCriterias((Map<Object, Object>) criterian);
		}else if(applianceName.equals("Speakers")){
			return checkSpeakersCriterias((Map<Object, Object>) criterian);
		}else if(applianceName.equals("Speakers")){
			return checkSpeakersCriterias((Map<Object, Object>) criterian);
		} else if(applianceName.equals("TabletPC")){
			return checkTablePcCriterias((Map<Object, Object>) criterian);
		}else return checkVacuumCleanerCriterias((Map<Object, Object>) criterian);
	}

	private static boolean checkOvenCriterias(Map<Object , Object> criterian){
		return checkForNumber(criterian.values());
	}

	private static boolean checkLaptopCriterias(Map<Object , Object> criterian){
		if(criterian.containsKey(SearchCriteria.Laptop.OS) == false){
			return checkForNumber(criterian.values());
		}else{
			Object os = criterian.get(SearchCriteria.Laptop.OS);
			return  (os instanceof String);
		}
	}


	private static boolean checkRefrigeratorCriterias(Map<Object , Object> criterian){
		return checkForNumber(criterian.values());
	}


	private static boolean checkSpeakersCriterias(Map<Object , Object> criterian){
		return checkForNumber(criterian.values());
	}

	private static boolean checkTablePcCriterias(Map<Object , Object> criterian){
		ArrayList<Object> values = new ArrayList<Object>(criterian.values());
		if(criterian.containsKey(SearchCriteria.TabletPC.COLOR)){
			Object color = criterian.get(SearchCriteria.TabletPC.COLOR);
			if((color instanceof String) == false) return false;
			Object value = criterian.get(SearchCriteria.TabletPC.COLOR);
			SearchCriteria.TabletPC key = SearchCriteria.TabletPC.COLOR;
			values.remove(value);
			return checkForNumber(values);
		}else {
			return checkForNumber(values);
		}
	}

	private static boolean checkVacuumCleanerCriterias(Map<Object , Object> criterian){
		ArrayList<Object> values = new ArrayList<Object>(criterian.values());

		if(criterian.containsKey(SearchCriteria.VacuumCleaner.FILTER_TYPE)){
			Object color = criterian.get(SearchCriteria.VacuumCleaner.FILTER_TYPE);
			if((color instanceof String) == false) return false;
			values.remove(SearchCriteria.VacuumCleaner.FILTER_TYPE);
		}

		if(criterian.containsKey(SearchCriteria.VacuumCleaner.BAG_TYPE)){
			Object color = criterian.get(SearchCriteria.VacuumCleaner.BAG_TYPE);
			if((color instanceof String) == false) return false;
			values.remove(SearchCriteria.VacuumCleaner.BAG_TYPE);
		}

		if(criterian.containsKey(SearchCriteria.VacuumCleaner.WAND_TYPE)){
			Object color = criterian.get(SearchCriteria.VacuumCleaner.WAND_TYPE);
			if((color instanceof String) == false) return false;
			values.remove(SearchCriteria.VacuumCleaner.WAND_TYPE);
		}
		return checkForNumber(values);
	}

	private static void didntInventMethodNameSoz(List list , SearchCriteria searchCriteria){



	}





	private static  boolean checkForNumber(Collection<Object> values){
		for(Object tmp : values){
			if((tmp instanceof Number)){
				if(((Number) tmp).doubleValue() < 0) {
					return false;}
			}else if((tmp instanceof Number) == false) {
					return false;}
		}
		return true;
	}




}

