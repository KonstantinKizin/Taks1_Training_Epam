package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class SpeakerCriteriaTest {
    Criteria<Speakers> criteriaSpeaker;

    @Before
    public void setUp(){
        criteriaSpeaker = new Criteria<Speakers>();
    }

    @Test
    public void when_FREQUENCY_RANGE_is_string_and_valid_then_should_return_true(){

        criteriaSpeaker.add(Speakers.FREQUENCY_RANGE , "3-3.5");
        assertTrue(criteriaValidator(criteriaSpeaker));
    }

    @Test
    public void when_FREQUENCY_RANG_is_string_but_not_valid_then_should_return_false(){
        criteriaSpeaker.add(Speakers.FREQUENCY_RANGE , "3-dd");
        assertTrue(criteriaValidator(criteriaSpeaker) == false);

    }

    @Test
    public void when_all_parametars_beside_valid_FREQUENCY_RANG_are_number_then_should_return_true(){
        criteriaSpeaker.add(Speakers.FREQUENCY_RANGE , "3-3.5");
        criteriaSpeaker.add(Speakers.CORD_LENGTH , 1);
        criteriaSpeaker.add(Speakers.NUMBER_OF_SPEAKERS , 1);
        assertTrue(criteriaValidator(criteriaSpeaker));
    }

    @Test
    public void when_at_least_one_parametar_is_string_beside_valid_FREQUENCY_RANG_then_should_return_false(){
        criteriaSpeaker.add(Speakers.FREQUENCY_RANGE , "3-3.5");
        criteriaSpeaker.add(Speakers.CORD_LENGTH , 1);
        criteriaSpeaker.add(Speakers.NUMBER_OF_SPEAKERS , "1");
        assertTrue(criteriaValidator(criteriaSpeaker) == false);

    }

}
