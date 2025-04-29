package case_study.view;

import ss17_io_binary_file.manager_product_by_character_file.entity.Phone;

import java.util.List;

public class SameView<T> {
    public void display(List<T> tList){
        for(T t: tList){
            System.out.println(t);
        }
    }
}
