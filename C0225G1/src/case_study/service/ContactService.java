package case_study.service;

import case_study.model.Contract;

import java.util.List;

public class ContactService implements IContactService{
    @Override
    public List<Contract> findAll() {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void add(Contract contract) {

    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void update(Contract contract) {

    }
}
