package case_study.view;


import java.util.List;

public class SameView<T> {
    public void display(List<T> tList){
        for(T t: tList){
            System.out.println(t);
        }
    }
}
