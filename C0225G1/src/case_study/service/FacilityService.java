package case_study.service;

import case_study.model.Facility;

import java.util.List;

public class FacilityService implements IFacilityService{
    @Override
    public List<Facility> findAll() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public boolean findId(int id) {
        return false;
    }

    @Override
    public void update(Facility facility) {

    }
}
