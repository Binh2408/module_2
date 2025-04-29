package case_study.repository;

import case_study.model.Contract;

import java.util.List;

public class ContactRepository implements IContactRepository{
    @Override
    public List<Contract> findAll() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void add(Contract contract) {

    }

    @Override
    public boolean findId(int id) {
        return false;
    }

    @Override
    public void update(Contract contract) {

    }
}
