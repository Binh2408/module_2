package ss5_access_modifier_static_method_static_property.bai_tap.bai_3_CRUD_product;

import java.util.Scanner;

public class ProductManager {
    private  static Product[] products = new Product[100];
    private Scanner scanner = new Scanner(System.in);
    
    static {
        products[0] = new Product(1, "Máy tính", 100000);
        products[1] = new Product(2,"Điện thoại", 200000);
        products[2] = new Product(3, "Chuột máy tính", 50000);
    }
    public void display() {
        for (int i = 0; i < products.length; i++){
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }
    
    public void add() {
        System.out.println("Enter id: ");
        int idProduct = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Enter name product: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter price product: ");
        double priceProduct = Double.parseDouble(scanner.nextLine());
        Product product = new Product(idProduct,nameProduct,priceProduct);
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println("Add success!!!");
                return;
            }
        }
        System.out.println("List is full can not add");
    }
    
    public void delete() {
        System.out.println("Enter name want to delete: ");
        String inputName = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && inputName.equalsIgnoreCase(products[i].getName().toLowerCase())) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j+1];
                }
                products[products.length-1] = null;
                System.out.println("Delete success!!!");
                return;
            }
        }
        System.out.println("Not found!!!");
    }
    
    public void edit() {
        System.out.println("Enter name want to edit: ");
        String inputName = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && inputName.equalsIgnoreCase(products[i].getName().toLowerCase())) {
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.println("Enter new price: ");
                int newPrice = Integer.parseInt(scanner.nextLine());
                products[i].setName(newName);
                products[i].setPrice(newPrice);
                System.out.println("Edit success!!!");
                return;
            }
        }
    }
    
    public void search() {
        System.out.println("Enter name want search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(products[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found product!!!");
        }
    }
}
