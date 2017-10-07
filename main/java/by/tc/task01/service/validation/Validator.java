package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		Map<Object , Object> criterian = (Map<Object, Object>)criteria.getCriteria();
		String applianceName = criteria.getApplianceName();

		if(applianceName.equalsIgnoreCase("Oven")){
			return checkOvenCriterias( criterian);
		}else if(applianceName.equals("Laptop")){

			return checkLaptopCriterias( criterian);

		}else if(applianceName.equals("Refrigerator")){

			return checkRefrigeratorCriterias(criterian);

		}else if(applianceName.equals("Speakers")){

			return checkSpeakersCriterias(criterian);

		}else if(applianceName.equals("Speakers")){

			return checkSpeakersCriterias(criterian);

		} else if(applianceName.equals("TabletPC")){

			return checkTablePcCriterias(criterian);

		}else return checkVacuumCleanerCriterias( criterian);
	}

	private static boolean checkOvenCriterias(Map<Object , Object> criterian){
		return checkForNumber(criterian.values());
	}

	private static boolean checkLaptopCriterias(Map<Object , Object> criterian){
		ArrayList<Object> values = new ArrayList<Object>(criterian.values());

		if(criterian.containsKey(SearchCriteria.Laptop.OS) == false){
			return checkForNumber(criterian.values());
		}else{
			Object os = criterian.get(SearchCriteria.Laptop.OS);
			if( os instanceof String){
				values.remove(os);
				return checkForNumber(values);
			}else {
				return false;
			}
		}
	}


	private static boolean checkRefrigeratorCriterias(Map<Object , Object> criterian){
		return checkForNumber(criterian.values());
	}


	private static boolean checkSpeakersCriterias(Map<Object , Object> criterian){
		ArrayList<Object> values = new ArrayList<Object>(criterian.values());

		if(criterian.containsKey(SearchCriteria.Speakers.FREQUENCY_RANGE)){
			Object color = criterian.get(SearchCriteria.Speakers.FREQUENCY_RANGE);
			if(color instanceof String){
				String freRange = (String) color;
				Pattern pattern = Pattern.compile("(\\d{1,})-(\\d{1,})");
				Matcher matcher = pattern.matcher(freRange);
				if(matcher.find()){
					values.remove(color);
				}else return false;
			}else return false;
		}
		return checkForNumber(values);
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



	private static  boolean checkForNumber(Collection<Object> values){
		for(Object tmp : values){
			if((tmp instanceof Number)){
				if(((Number) tmp).doubleValue() < 0) {
					return false;
				}
			}
			if((tmp instanceof Number) == false) {
					return false;
			}
			if(tmp instanceof String) {
				return false;
			}
		}
		return true;
	}




}

