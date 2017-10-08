package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import static org.junit.Assert.assertTrue;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import org.junit.Before;
import org.junit.Test;

public class LoptopCriteriaTest {
    Criteria<SearchCriteria.Laptop> criteriaLaptop;

    @Before
    public void setUp(){
        criteriaLaptop = new Criteria<SearchCriteria.Laptop>();
    }



    @Test
    public void when_OS_is_not_string_should_return_false(){
        criteriaLaptop.add(SearchCriteria.Laptop.OS , 12);
        assertTrue(criteriaValidator(criteriaLaptop) == false);
    }

    @Test
    public void when_at_least_one_parameter_beside_OS_is_string_should_return_false(){

        criteriaLaptop.add(SearchCriteria.Laptop.OS , "string");
        criteriaLaptop.add(SearchCriteria.Laptop.BATTERY_CAPACITY , 10);
        criteriaLaptop.add(SearchCriteria.Laptop.CPU , 10);
        criteriaLaptop.add(SearchCriteria.Laptop.DISPLAY_INCHS , 10);
        criteriaLaptop.add(SearchCriteria.Laptop.SYSTEM_MEMORY , "123");
        assertTrue(criteriaValidator(criteriaLaptop) == false);
    }



}
