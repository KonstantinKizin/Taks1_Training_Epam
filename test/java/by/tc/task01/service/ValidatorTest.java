package by.tc.task01.service;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.Validator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ValidatorTest {

    Criteria<SearchCriteria.Oven> criteriaOven;
    Criteria<SearchCriteria.TabletPC> criteriaTablePC;
    Criteria<SearchCriteria.Laptop> criteriaLoptop;
    Criteria<SearchCriteria.Refrigerator> criteriaRefrigerator;
    Criteria<SearchCriteria.Speakers> criteriaSpeakers;
    Criteria<SearchCriteria.VacuumCleaner> criteriaVacuumCleaner;



    @Before
    public void setUp(){
        criteriaOven = new Criteria<SearchCriteria.Oven>();
        criteriaTablePC = new Criteria<SearchCriteria.TabletPC>();
        criteriaLoptop = new Criteria<SearchCriteria.Laptop>();
        criteriaRefrigerator = new Criteria<SearchCriteria.Refrigerator>();
        criteriaSpeakers = new Criteria<SearchCriteria.Speakers>();
        criteriaVacuumCleaner = new Criteria<SearchCriteria.VacuumCleaner>();

    }




    @Test
    public void OvenValidTest(){



        criteriaSpeakers.add(SearchCriteria.Speakers.FREQUENCY_RANGE , "12-12");
        Assert.assertTrue(Validator.criteriaValidator(criteriaSpeakers));

    }






}
