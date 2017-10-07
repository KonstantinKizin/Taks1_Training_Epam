package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import org.junit.Before;

public class SpeakerCriteriaTest {
    Criteria<SearchCriteria.Speakers> criteriaOven;

    @Before
    public void setUp(){
        criteriaOven = new Criteria<SearchCriteria.Speakers>();
    }

}
