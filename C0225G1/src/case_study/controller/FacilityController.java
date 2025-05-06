package case_study.controller;

import case_study.common.InputException;

public class FacilityController {
    public static void displayMenuFacility(){
        boolean flag = false;
        do {
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");
            int choose = InputException.getInput();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 4");

            }
        } while (!flag);
    }
}
