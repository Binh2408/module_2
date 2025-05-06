package case_study.service;

import case_study.model.Facility;
import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;

import java.util.List;
import java.util.Map;

public class FacilityService implements IFacilityService{
    private final IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public List<Facility> findAll() {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void update(Facility facility) {

    }

    @Override
    public void displayFacility() {
        Map<Facility, Integer> facilities = facilityRepository.getAllFacilityMap();
        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            System.out.println(entry.getKey() + " | Used: " + entry.getValue() + " times");
        }
    }

    @Override
    public void addNewFacility() {

    }

    @Override
    public void displayFacilityNeedMaintenance() {

    }
}
