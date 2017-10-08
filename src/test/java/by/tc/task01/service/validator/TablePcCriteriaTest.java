package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class TablePcCriteriaTest {
    Criteria<SearchCriteria.TabletPC> criteriaTablePC;

    @Before
    public void setUp(){
        criteriaTablePC = new Criteria<SearchCriteria.TabletPC>();
    }

    @Test
    public void when_COLOR_is_not_string_should_return_false(){

        criteriaTablePC.add(TabletPC.COLOR , "as");
        assertTrue(criteriaValidator(criteriaTablePC));
    }

    @Test
    public void when_all_parameters_beside_COLOR_are_number_then_should_return_true(){
        criteriaTablePC.add(TabletPC.COLOR , "as");
        criteriaTablePC.add(TabletPC.DISPLAY_INCHES , 1);
        criteriaTablePC.add(TabletPC.MEMORY_ROM , 1);
        criteriaTablePC.add(TabletPC.FLASH_MEMORY_CAPACITY , 1);
        assertTrue(criteriaValidator(criteriaTablePC));
    }

    @Test
    public void when_at_least_parameter_beside_COLOR_is_string_should_return_false(){

        criteriaTablePC.add(TabletPC.COLOR , "as");
        criteriaTablePC.add(TabletPC.DISPLAY_INCHES , 1);
        criteriaTablePC.add(TabletPC.MEMORY_ROM , 1);
        criteriaTablePC.add(TabletPC.FLASH_MEMORY_CAPACITY , "1");
        assertTrue(criteriaValidator(criteriaTablePC) == false);

    }

    @Test
    public void when_all_parametors_including_COLOR_are_number_then_should_return_false(){

        criteriaTablePC.add(TabletPC.COLOR , 1);
        criteriaTablePC.add(TabletPC.DISPLAY_INCHES , 1);
        criteriaTablePC.add(TabletPC.MEMORY_ROM , 1);
        criteriaTablePC.add(TabletPC.FLASH_MEMORY_CAPACITY , 1);
        assertTrue(criteriaValidator(criteriaTablePC) == false);
    }
}
