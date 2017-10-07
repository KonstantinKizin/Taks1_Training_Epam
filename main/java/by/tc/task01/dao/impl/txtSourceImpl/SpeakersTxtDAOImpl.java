package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

public class SpeakersTxtDAOImpl extends AbstractAppliencTxtDAO {
    @Override
    protected String getTypeName() {
        return "Speakers";
    }

    @Override
    protected Appliance buildAppliance(Map<String, String> appliancMap) {

        Speakers speakers = new Speakers();






        return speakers;
    }
}
