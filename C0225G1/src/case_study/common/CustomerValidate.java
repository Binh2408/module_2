package case_study.common;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class CustomerValidate {
    private static final String ID_REGEX = "^KH-\\d{4}$";
    private static final String NAME_REGEX = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$";
    private static final String CMND_REGEX = "^\\d{9}|\\d{12}$";
    private static final String PHONE_REGEX = "^0\\d{9}$";
    public static void validateId(String id) throws Exception {
        if (!Pattern.matches(ID_REGEX, id)) {
            throw new Exception("Invalid customerId. Format: KH-YYYY.");
        }
    }

    public static void validateName(String name) throws Exception {
        if (!Pattern.matches(NAME_REGEX, name)) {
            throw new Exception("Invalid name. Must uppercase first character.");
        }
    }

    public static void validateAge(LocalDate dob) throws Exception {
        LocalDate today = LocalDate.now();
        int years = today.getYear() - dob.getYear();
        // Kiểm tra xem ngày sinh đã qua ngày sinh trong năm nay chưa
        if (today.getMonthValue() < dob.getMonthValue() ||
                (today.getMonthValue() == dob.getMonthValue() && today.getDayOfMonth() < dob.getDayOfMonth())) {
            years--;  // Nếu chưa đủ tuổi, giảm 1 năm
        }
        if (years < 18) {
            throw new Exception("Employees must be at least 18 years of age.");
        }
    }

    public static void validateCmnd(String cmnd) throws Exception {
        if (!Pattern.matches(CMND_REGEX, cmnd)) {
            throw new Exception("CMND must is 9 or 12 number.");
        }
    }

    public static void validatePhone(String phone) throws Exception {
        if (!Pattern.matches(PHONE_REGEX, phone)) {
            throw new Exception("Phone number must begin 0 and has full 10 numbers.");
        }
    }

}
