package ss5_access_modifier_static_method_static_property.bai_tap.bai_2_xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "C02";
    Student() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString() {
        return "Name: " + name + "\nClass: " + classes;
    }
}
