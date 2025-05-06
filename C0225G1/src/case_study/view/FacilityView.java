package case_study.view;

import case_study.common.FacilityValidate;
import case_study.model.House;
import case_study.model.Villa;

import java.util.Scanner;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);
    public static Villa inputVilla(){
        String serviceId, serviceName, rentType, roomStandard;
        double usableArea, rentalCost, poolArea;
        int maxPersonQuantity, floorNumber;
        while (true) {
            try {
                System.out.println("Enter Villa ID: ");
                serviceId = scanner.nextLine();
                FacilityValidate.validateVillaId(serviceId);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        while(true) {
            try {
                System.out.println("Enter name service: ");
                serviceName = scanner.nextLine();
                FacilityValidate.validateServiceName(serviceName);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter area villa:  ");
                usableArea = Double.parseDouble(scanner.nextLine());
                FacilityValidate.validateArea(usableArea);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try{
                System.out.println("Enter rental cost: ");
                rentalCost = Double.parseDouble(scanner.nextLine());
                FacilityValidate.validateCost(rentalCost);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter peple quantity: ");
                maxPersonQuantity = Integer.parseInt(scanner.nextLine());
                FacilityValidate.validateMaxPeople(maxPersonQuantity);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter rent type: ");
        rentType = scanner.nextLine();

        System.out.println("Enter room standard: ");
        roomStandard = scanner.nextLine();

        while (true) {
            try {
                System.out.println("Enter pool area: ");
                poolArea = Double.parseDouble(scanner.nextLine());
                FacilityValidate.validateArea(poolArea);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter floor number: ");
                floorNumber = Integer.parseInt(scanner.nextLine());
                FacilityValidate.validateFloors(floorNumber);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return new Villa(serviceId,serviceName,usableArea,rentalCost,maxPersonQuantity,rentType,roomStandard,poolArea,floorNumber);
    }

    public static House inputHouse(){
        String serviceId, serviceName, rentType, roomStandard;
        double usableArea, rentalCost;
        int maxPersonQuantity, floorNumber;
        while (true) {
            try {
                System.out.println("Enter House ID: ");
                serviceId = scanner.nextLine();
                FacilityValidate.validateVillaId(serviceId);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        while(true) {
            try {
                System.out.println("Enter name service: ");
                serviceName = scanner.nextLine();
                FacilityValidate.validateServiceName(serviceName);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter area house:  ");
                usableArea = Double.parseDouble(scanner.nextLine());
                FacilityValidate.validateArea(usableArea);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try{
                System.out.println("Enter rental cost: ");
                rentalCost = Double.parseDouble(scanner.nextLine());
                FacilityValidate.validateCost(rentalCost);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter peple quantity: ");
                maxPersonQuantity = Integer.parseInt(scanner.nextLine());
                FacilityValidate.validateMaxPeople(maxPersonQuantity);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter rent type: ");
        rentType = scanner.nextLine();

        System.out.println("Enter room standard: ");
        roomStandard = scanner.nextLine();

        while (true) {
            try {
                System.out.println("Enter floor number: ");
                floorNumber = Integer.parseInt(scanner.nextLine());
                FacilityValidate.validateFloors(floorNumber);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return new House(serviceId,serviceName,usableArea,rentalCost,maxPersonQuantity,rentType,roomStandard,floorNumber);
    }

}
