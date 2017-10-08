package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import static by.tc.task01.service.validation.Validator.criteriaValidator;


public class ApplianceServiceImpl implements ApplianceService{

	private ApplianceDAO applianceDAO;


	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		boolean valid = criteriaValidator(criteria);
		Appliance appliance = null;
		if (valid) {
			try {
				applianceDAO = new ApplianceDAOImpl();
				appliance = applianceDAO.find(criteria);
			} catch (DAOException e) {
				throw new ServiceException(e.getMessage());
			}
		}
		return appliance;
	}


}

