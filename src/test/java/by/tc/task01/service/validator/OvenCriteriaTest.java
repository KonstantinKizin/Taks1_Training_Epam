package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class OvenCriteriaTest {

    Criteria<SearchCriteria.Oven> criteriaOven;

    @Before
    public void setUp(){
        criteriaOven = new Criteria<SearchCriteria.Oven>();
    }


    @Test
    public void when_POWER_CONSUMPTION_is_string_should_return_false(){
        criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION , "123");
        assertTrue(criteriaValidator(criteriaOven) == false);
    }

    @Test
    public void when_POWER_CONSUMPTION_is_number_should_return_true(){
        criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION , 123);
        assertTrue(criteriaValidator(criteriaOven));
    }

    @Test
    public void when_all_parameters_are_Number_should_return_true(){

        criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION , 123);
        criteriaOven.add(SearchCriteria.Oven.WEIGHT,10);
        criteriaOven.add(SearchCriteria.Oven.CAPACITY,12);
        criteriaOven.add(SearchCriteria.Oven.DEPTH , 12);
        criteriaOven.add(SearchCriteria.Oven.HEIGHT , 10);
        criteriaOven.add(SearchCriteria.Oven.WIDTH , 13);
        assertTrue(criteriaValidator(criteriaOven));

    }

    @Test
    public void when_at_least_one_is_string_should_return_false(){

        criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION , 12);
        criteriaOven.add(SearchCriteria.Oven.WEIGHT,10);
        criteriaOven.add(SearchCriteria.Oven.CAPACITY,"123");
        criteriaOven.add(SearchCriteria.Oven.DEPTH , 12);
        criteriaOven.add(SearchCriteria.Oven.HEIGHT , 10);
        criteriaOven.add(SearchCriteria.Oven.WIDTH , 13);
        assertTrue(criteriaValidator(criteriaOven) == false);
    }



}
