package case_study.common;

import java.util.regex.Pattern;

public class FacilityValidate {
    private static final String ID_VILLA_REGEX = "^SVVL-\\d{4}$";
    private static final String ID_HOUSE_REGEX = "^SVHO-\\d{4}$";
    private static final String ID_ROOM_REGEX = "^SVRO-\\d{4}$";
    private static final String NAME_REGEX = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$";

    public static void validateVillaId(String id) throws Exception {
        if (!Pattern.matches(ID_VILLA_REGEX, id)) {
            throw new Exception("Invalid ID Villa. Format: SVVL-YYYY.");
        }
    }

    public static void validateHouseId(String id) throws Exception {
        if (!Pattern.matches(ID_HOUSE_REGEX, id)) {
            throw new Exception("Invalid ID House. Format: SVHO-YYYY.");
        }
    }

    public static void validateRoomId(String id) throws Exception {
        if (!Pattern.matches(ID_ROOM_REGEX, id)) {
            throw new Exception("Invalid ID Room. Format: SVRO-YYYY.");
        }
    }

    public static void validateServiceName(String name) throws Exception{
        if (!Pattern.matches(NAME_REGEX,name)){
            throw new Exception("Invalid service name. Must uppercase first character.");
        }
    }

    public static void validateArea(double area) throws Exception{
        if (area <= 30) {
            throw new Exception("Area must be greater than 30m2.");
        }
    }

    public static void validateCost(double cost) throws Exception {
        if (cost <= 0) {
            throw new Exception("Cost must be a positive number.");
        }
    }

    public static void validateMaxPeople(int number) throws Exception {
        if (number <= 0 || number >= 20) {
            throw new Exception("Max people must be >0 and <20.");
        }
    }

    public static void validateFloors(int floors) throws Exception {
        if (floors <= 0) {
            throw new Exception("Number of floors must be a positive integer.");
        }
    }
}
