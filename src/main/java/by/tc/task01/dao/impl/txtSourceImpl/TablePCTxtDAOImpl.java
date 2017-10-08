package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class TablePCTxtDAOImpl extends AbstractAppliencTxtDAO {
    @Override
    protected String getTypeName() {
        return "TabletPC";
    }

    @Override
    protected Appliance buildAppliance(Map<String, String> appliancMap) {

        TabletPC tabletPC = new TabletPC();

        tabletPC.setBatareyCapacity(Float.parseFloat(appliancMap.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.name())));

        tabletPC.setColor(appliancMap.get(SearchCriteria.TabletPC.COLOR.name()));

        tabletPC.setDisplayInchs(Float.parseFloat(appliancMap.get(SearchCriteria.TabletPC.DISPLAY_INCHES.name())));

        tabletPC.setFlashMemoryCapacity(Float.parseFloat(appliancMap.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name())));

        tabletPC.setMemoryRom(Float.parseFloat(appliancMap.get(SearchCriteria.TabletPC.MEMORY_ROM.name())));

        return tabletPC;
    }
}
