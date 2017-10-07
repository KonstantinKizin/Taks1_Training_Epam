package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class VacuumCleanerCriteriaTest {
    Criteria<SearchCriteria.VacuumCleaner> criteriaVacuum;

    @Before
    public void setUp(){
        criteriaVacuum = new Criteria<SearchCriteria.VacuumCleaner>();
    }


    @Test
    public void when_FILTER_TYPE_is_not_strig_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.FILTER_TYPE , 10);
        assertTrue(criteriaValidator(criteriaVacuum) == false);

    }

    @Test
    public void when_BAG_TYPEE_is_not_strig_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.BAG_TYPE , 10);
        assertTrue(criteriaValidator(criteriaVacuum) == false);

    }

    @Test
    public void when_BAG_TYPE_is_string_then_should_return_true(){
        criteriaVacuum.add(VacuumCleaner.BAG_TYPE , "s");
        assertTrue(criteriaValidator(criteriaVacuum));

    }

    @Test
    public void when_WAND_TYPE_is_not_string_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.WAND_TYPE , 1);
        assertTrue(criteriaValidator(criteriaVacuum) == false);

    }







}
