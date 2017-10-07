package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import org.junit.Before;

public class VacuumCleanerCriteriaTest {
    Criteria<SearchCriteria.VacuumCleaner> criteriaOven;

    @Before
    public void setUp(){
        criteriaOven = new Criteria<SearchCriteria.VacuumCleaner>();
    }
}
