package ss19_string_regex;

public class NamePersonRegex {
    public static void main(String[] args) {
        String name = "Nguyen Van A";
        String regexName = "^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$";
        boolean check = name.matches(regexName);
        if (check) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Ko hợp lệ");
        }
    }
}
