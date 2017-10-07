package by.tc.task01.service.impl;

import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.impl.txtSourceImpl.LaptopTxtDaoImpl;
import by.tc.task01.dao.impl.txtSourceImpl.OvenTxtDAOImpl;
import by.tc.task01.dao.impl.txtSourceImpl.RefrigeratorTxtDAOImpl;
import by.tc.task01.dao.impl.txtSourceImpl.TablePCTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{


	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		boolean valid = criteriaValidator(criteria);
		Appliance appliance = null;
		if (valid) {
			try {
				String applianceName = criteria.getApplianceName();

				if(applianceName.equalsIgnoreCase("Oven")){
					appliance =  new OvenTxtDAOImpl().find(criteria);
				}else if(applianceName.equalsIgnoreCase("Laptop")){
					appliance = new LaptopTxtDaoImpl().find(criteria);
				}else if(applianceName.equalsIgnoreCase("Refrigerator")){
					appliance = new RefrigeratorTxtDAOImpl().find(criteria);
				}else if(applianceName.equalsIgnoreCase("TabletPC")){
					appliance = new TablePCTxtDAOImpl().find(criteria);
				}
			} catch (DAOException e) {
				throw new ServiceException(e.getCause().getMessage());
			}
		}
		return appliance;
	}



	@Override
	public <E> boolean add(Criteria<E> criteria) {

		return false;
	}


	@Override
	public <E> boolean delete(Criteria<E> criteria) {


		return false;
	}

	@Override
	public <E> void updateOrAdd(Criteria<E> criteria) {


	}

	@Override
	public <E> List<Appliance> getAll() {
		return null;
	}

}

