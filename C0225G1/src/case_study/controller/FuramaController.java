package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean flagMain = false;
        do {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            int chooseMain = getInput();
            boolean flagSubMain = false;
            switch (chooseMain) {
                case 1:
                    do {
                        System.out.println("1.\tDisplay list employees");
                        System.out.println("2.\tAdd new employee");
                        System.out.println("3.\tEdit employee");
                        System.out.println("4.\tReturn main menu");
                        int chooseSubMain = getInput();
                        switch (chooseSubMain) {
                            case 1:
                                System.out.println("1.\tDisplay list employees");
                                break;
                            case 2:
                                System.out.println("2.\tAdd new employee");
                                break;
                            case 3:
                                System.out.println("3.\tEdit employee");
                                break;
                            case 4:
                                flagSubMain = true;
                                break;
                            default:
                                System.out.println("Please choice from 1 to 4");
                        }
                    } while (!flagSubMain);
                    break;
                case 2:
                    do {
                        System.out.println("1.\tDisplay list customers");
                        System.out.println("2.\tAdd new customer");
                        System.out.println("3.\tEdit customer");
                        System.out.println("4.\tReturn main menu");
                        int chooseSubMain = getInput();
                        switch (chooseSubMain) {
                            case 1:
                                System.out.println("1.\tDisplay list employees");
                                break;
                            case 2:
                                System.out.println("2.\tAdd new employee");
                                break;
                            case 3:
                                System.out.println("3.\tEdit employee");
                                break;
                            case 4:
                                flagSubMain = true;
                                break;
                            default:
                                System.out.println("Please choice from 1 to 4");
                        }
                    } while (!flagSubMain);
                    break;
                case 3:
                    do {
                        System.out.println("1.\tDisplay list facility");
                        System.out.println("2.\tAdd new facility");
                        System.out.println("3.\tDisplay list facility maintenance");
                        System.out.println("4.\tReturn main menu");
                        int chooseSubMain = getInput();
                        switch (chooseSubMain) {
                            case 1:
                                System.out.println("1.\tDisplay list employees");
                                break;
                            case 2:
                                System.out.println("2.\tAdd new employee");
                                break;
                            case 3:
                                System.out.println("3.\tEdit employee");
                                break;
                            case 4:
                                flagSubMain = true;
                                break;
                            default:
                                System.out.println("Please choice from 1 to 4");
                        }
                    } while (!flagSubMain);
                    break;
                case 4:
                    do {
                        System.out.println("1.\tAdd new booking");
                        System.out.println("2.\tDisplay list booking");
                        System.out.println("3.\tCreate new contracts");
                        System.out.println("4.\tDisplay list contracts");
                        System.out.println("5.\tEdit contracts");
                        System.out.println("6.\tReturn main menu");
                        int chooseSubMain = getInput();
                        switch (chooseSubMain) {
                            case 1:
                                System.out.println("1.\tDisplay list employees");
                                break;
                            case 2:
                                System.out.println("2.\tAdd new employee");
                                break;
                            case 3:
                                System.out.println("3.\tEdit employee");
                                break;
                            case 4:
                                System.out.println("3.\tEdit employee");
                                break;
                            case 5:
                                System.out.println("3.\tEdit employee");
                                break;
                            case 6:
                                flagSubMain = true;
                                break;
                            default:
                                System.out.println("Please choice from 1 to 6");
                        }
                    } while (!flagSubMain);
                    break;
                case 5:
                    do {
                        System.out.println("1.\tDisplay list customers use service");
                        System.out.println("2.\tDisplay list customers get voucher");
                        System.out.println("3.\tReturn main menu");
                        int chooseSubMain = getInput();
                        switch (chooseSubMain) {
                            case 1:
                                System.out.println("1.\tDisplay list employees");
                                break;
                            case 2:
                                System.out.println("2.\tAdd new employee");
                                break;
                            case 3:
                                flagSubMain = true;
                                break;
                            default:
                                System.out.println("Please choice form 1 to 3");
                        }
                    } while (!flagSubMain);
                    break;
                case 6:
                    flagMain = true;
                    break;
                default:
                    System.out.println("Please choice from 1 to 6");
            }
        } while (!flagMain);
    }

    // Helper method to get valid input
    private static int getInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }
}
