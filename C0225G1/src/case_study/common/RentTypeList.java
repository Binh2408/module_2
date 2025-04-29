package case_study.common;

import java.util.ArrayList;
import java.util.List;

public class RentTypeList {
    public static List<String> rentTypeList = new ArrayList<>();
    static {
        rentTypeList.add("Year");
        rentTypeList.add("Month");
        rentTypeList.add("Day");
        rentTypeList.add("Hour");
    }
}
