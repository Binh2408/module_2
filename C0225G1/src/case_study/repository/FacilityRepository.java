package case_study.repository;

import case_study.model.Facility;

import java.util.List;

public class FacilityRepository implements IFacilityRepository{
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
