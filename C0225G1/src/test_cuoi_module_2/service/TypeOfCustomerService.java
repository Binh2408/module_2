package test_cuoi_module_2.service;

import test_cuoi_module_2.entity.TypeOfCustomer;
import test_cuoi_module_2.repository.ITypeOfCustomerRepository;
import test_cuoi_module_2.repository.TypeOfCustomerRepository;

import java.util.List;

public class TypeOfCustomerService implements ITypeOfCustomerService{
    private static final ITypeOfCustomerRepository typeOfCustomerRepository = new TypeOfCustomerRepository();
    @Override
    public List<TypeOfCustomer> findAll() {
        return typeOfCustomerRepository.findAll();
    }

    @Override
    public void add(TypeOfCustomer typeOfCustomer) {
        typeOfCustomerRepository.add(typeOfCustomer);
    }
}
