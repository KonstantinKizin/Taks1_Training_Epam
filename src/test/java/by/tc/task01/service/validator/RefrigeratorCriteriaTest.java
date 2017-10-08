package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class RefrigeratorCriteriaTest {
    Criteria<SearchCriteria.Refrigerator> criteriaRefrigerator;

    @Before
    public void setUp(){
        criteriaRefrigerator = new Criteria<SearchCriteria.Refrigerator>();
    }

    @Test
    public void when_all_parametars_are_number_should_return_true(){
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.WIDTH , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.OVERALL_CAPACITY , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.HEIGHT , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.WEIGHT , 10);
        assertTrue(criteriaValidator(criteriaRefrigerator));
    }

    @Test
    public void when_at_least_parametar_is_string_should_return_false(){

        criteriaRefrigerator.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.WIDTH , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.OVERALL_CAPACITY , "10");
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.HEIGHT , 10);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.WEIGHT , 10);
        assertTrue(criteriaValidator(criteriaRefrigerator) == false);
    }

}
