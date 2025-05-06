package ss19_string_regex.bai_tap.bai_1_validate_className;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIK]$";
    public ValidateClassName(){}
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
