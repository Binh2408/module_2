package ss17_io_binary_file.manager_product_by_character_file.service;

import ss17_io_binary_file.manager_product_by_character_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_character_file.entity.Television;
import ss17_io_binary_file.manager_product_by_character_file.repository.ITelevisionRepository;
import ss17_io_binary_file.manager_product_by_character_file.repository.TelevisionRepository;

import java.util.List;

public class TelevisionService implements ITelevisionService{
    private static final ITelevisionRepository televisionRepository = new TelevisionRepository();
    @Override
    public List<Television> findAll() {
        return televisionRepository.findAll();
    }

    @Override
    public void delete(int id) {
        televisionRepository.delete(id);
    }

    @Override
    public void add(Television television) {
        televisionRepository.add(television);
    }

    @Override
    public boolean findId(int id) {
        return televisionRepository.findId(id);
    }

    @Override
    public void update(Television television) {
        televisionRepository.update(television);
    }

    @Override
    public void searchByName(String name) {
        List<Television> result = televisionRepository.searchByName(name);
        if (result.isEmpty()) {
            System.out.println("No product found with name: " + name);
        } else {
            for (Television television : result) {
                System.out.println(television);
            }
        }
    }

    @Override
    public List<Television> sortByPriceAscending() {
        return televisionRepository.sortByPriceAscending();
    }

    @Override
    public List<Television> sortByPriceDescending() {
        return televisionRepository.sortByPriceDescending();
    }
}
