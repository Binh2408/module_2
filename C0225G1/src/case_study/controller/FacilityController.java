package case_study.controller;

import case_study.common.InputException;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.FacilityService;
import case_study.service.IFacilityService;
import case_study.view.FacilityView;

public class FacilityController {
    private static final IFacilityService facilityService = new FacilityService();
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
                    Villa villa = FacilityView.inputVilla();
                    facilityService.add(villa);
                    System.out.println("Add new villa success");
                    break;
                case 2:
                    House house = FacilityView.inputHouse();
                    facilityService.add(house);
                    System.out.println("Add new house success");
                    break;
                case 3:
                    Room room = FacilityView.inputRoom();
                    facilityService.add(room);
                    System.out.println("Add new room success");
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
