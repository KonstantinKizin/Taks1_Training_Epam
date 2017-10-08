package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();

	private String applianceName;


	public void add(E searchCriteria, Object value) {
		setType(searchCriteria);
		criteria.put(searchCriteria, value);
	}

	public Map<E , Object> getCriteria(){
		return this.criteria;
	}
	private void setType(E e){
		this.applianceName = e.getClass().getSimpleName();
	}

	public String getApplianceName(){
		return this.applianceName;
	}








	


}
