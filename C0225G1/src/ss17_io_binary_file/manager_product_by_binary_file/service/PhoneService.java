package ss17_io_binary_file.manager_product_by_binary_file.service;

import ss17_io_binary_file.manager_product_by_binary_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_binary_file.repository.IPhoneRepository;
import ss17_io_binary_file.manager_product_by_binary_file.repository.PhoneRepository;
import ss17_io_binary_file.manager_product_by_binary_file.service.IPhoneService;

import java.util.List;

public class PhoneService implements IPhoneService {
    private final IPhoneRepository iPhoneRepository = new PhoneRepository();
    @Override
    public List<Phone> findAll() {
        return iPhoneRepository.findAll();
    }

    @Override
    public void delete(int id) {
        iPhoneRepository.delete(id);
    }

    @Override
    public void add(Phone phone) {
        iPhoneRepository.add(phone);
    }

    @Override
    public boolean findId(int id) {
        return iPhoneRepository.findId(id);
    }

    @Override
    public void update(Phone phone) {
        iPhoneRepository.update(phone);
    }

    public void searchByName(String name) {
        List<Phone> result = iPhoneRepository.searchByName(name);
        if (result.isEmpty()) {
            System.out.println("No product found with name: " + name);
        } else {
            for (Phone phone : result) {
                System.out.println(phone);
            }
        }
    }


    @Override
    public List<Phone> sortByPriceAscending() {
        return iPhoneRepository.sortByPriceAscending();
    }

    @Override
    public List<Phone> sortByPriceDescending() {
        return iPhoneRepository.sortByPriceDescending();
    }

}
