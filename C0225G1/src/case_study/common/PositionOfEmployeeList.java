package case_study.common;

import java.util.ArrayList;
import java.util.List;

public class PositionOfEmployeeList {
    public static List<String> positionList = new ArrayList<>();
    static {
        positionList.add("receptionist");
        positionList.add("waiter");
        positionList.add("specialist");
        positionList.add("supervisor");
        positionList.add("manager");
        positionList.add("director");
    }
}
