package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    private static LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
    static {
        facilityMap.put(new Villa("SVVL-0001", "Luxury Villa", 100.0, 500.0, 10, "Day", "Deluxe", 30.0, 2), 0);
        facilityMap.put(new House("SVHO-0001", "Family House", 80.0, 300.0, 8, "Month", "Standard", 1), 0);
        facilityMap.put(new Room("SVRO-0001", "Single Room", 30.0, 100.0, 2, "Hour", "Free Breakfast"), 0);
    }


    @Override
    public List<Facility> findAll() {
        return new ArrayList<>(facilityMap.keySet());
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility,0);
    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void update(Facility facility) {

    }

    @Override
    public Map<Facility, Integer> getAllFacilityMap() {
        return facilityMap;
    }

    @Override
    public Map<Facility, Integer> getFacilityNeedMaintenance() {
        Map<Facility, Integer> maintenanceMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                maintenanceMap.put(entry.getKey(), entry.getValue());
            }
        }
        return maintenanceMap;
    }
    public void increaseUsage(String serviceCode) {
        for (Facility facility : facilityMap.keySet()) {
            if (facility.getServiceId().equals(serviceCode)) {
                facilityMap.put(facility, facilityMap.get(facility) + 1);
                break;
            }
        }
    }
}
