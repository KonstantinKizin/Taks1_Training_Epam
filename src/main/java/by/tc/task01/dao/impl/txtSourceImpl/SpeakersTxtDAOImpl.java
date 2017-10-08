package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class SpeakersTxtDAOImpl extends AbstractAppliencTxtDAO {
    @Override
    protected String getTypeName() {
        return "Speakers";
    }

    @Override
    protected Appliance buildAppliance(Map<String, String> appliancMap) {

        Speakers speakers = new Speakers();

        speakers.setCordLenght(Float.parseFloat(appliancMap.get(SearchCriteria.Speakers.CORD_LENGTH.name())));

        speakers.setFrequencyRange(appliancMap.get(SearchCriteria.Speakers.FREQUENCY_RANGE.name()));

        speakers.setNumberOfSpeakers(Integer.parseInt(appliancMap.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name())));

        speakers.setPowerConsumption(Float.parseFloat(appliancMap.get(SearchCriteria.Speakers.POWER_CONSUMPTION.name())));

        return speakers;
    }
}
