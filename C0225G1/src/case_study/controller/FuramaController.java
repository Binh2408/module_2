package case_study.controller;

import case_study.common.InputException;
import case_study.model.Booking;
import case_study.model.Customer;
import case_study.model.Employee;
import case_study.repository.IBookingRepository;
import case_study.service.*;
import case_study.view.*;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IEmployeeService employeeService = new EmployeeService();
    private static final ICustomerService customerService = new CustomerService();
    private static final IFacilityService facilityService = new FacilityService();
    private static final IBookingService bookingService = new BookingService();
    public static void displayMainMenu() {
        boolean flagMain = false;
        do {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.println("Choose function: ");
            int chooseMain = InputException.getInput();
            boolean flagSubMain = false;
            switch (chooseMain) {
                case 1:
                    do {
                        System.out.println("1.\tDisplay list employees");
                        System.out.println("2.\tAdd new employee");
                        System.out.println("3.\tEdit employee");
                        System.out.println("4.\tReturn main menu");
                        System.out.println("Choose function: ");
                        int chooseSubMain = InputException.getInput();
                        switch (chooseSubMain) {
                            case 1:
//                                System.out.println("1.\tDisplay list employees");
                                SameView<Employee> employeeSameView = new SameView<>();
                                employeeSameView.display(employeeService.findAll());
                                break;
                            case 2:
//                                System.out.println("2.\tAdd new employee");
                                Employee employee = EmployeeView.inputEmployee();
                                if (employeeService.isEmployeeIdExists(employee.getEmployeeId(), employeeService.findAll())) {
                                    System.out.println("Id is already exists!!!");
                                } else {
                                    employeeService.add(employee);
                                    System.out.println("Add employee success!!!");
                                    break;
                                }
                                break;

                            case 3:
//                                System.out.println("3.\tEdit employee");
                                String id = EmployeeView.inputID();
                                if (employeeService.findId(id)) {
                                    Employee employee1 = EmployeeView.inputForUpdateEmployee(id);
                                    employeeService.update(employee1);
                                    System.out.println("Edit employee success!!!");
                                } else {
                                    System.out.println("Employee ID not found " + id);
                                }
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
                        int chooseSubMain = InputException.getInput();
                        switch (chooseSubMain) {
                            case 1:
                                SameView<Customer> customerSameView = new SameView<>();
                                customerSameView.display(customerService.findAll());
                                break;
                            case 2:
                                Customer customer = CustomerView.inputCustomer();
                                if (customerService.isCustomerIdExists(customer.getCustomerId(), customerService.findAll())) {
                                    System.out.println("ID is already exists!!!");
                                } else {
                                    customerService.add(customer);
                                    System.out.println("Add customer success!!!");
                                    break;
                                }
                                break;
                            case 3:
                                String id = CustomerView.inputID();
                                if (customerService.findId(id)) {
                                    Customer customer1 = CustomerView.inputForUpdateCUstomer(id);
                                    customerService.update(customer1);
                                    System.out.println("Edit customer success!!!");
                                } else {
                                    System.out.println("ID customer not found " + id);
                                }
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
                        int chooseSubMain = InputException.getInput();
                        switch (chooseSubMain) {
                            case 1:
                                FacilityView.displayFacility(facilityService.displayFacility());
                                break;
                            case 2:
                                FacilityController.displayMenuFacility();
                                break;
                            case 3:
                                FacilityView.showFacilitiesNeedMaintenance(facilityService.displayFacilityNeedMaintenance());
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
                        int chooseSubMain = InputException.getInput();
                        switch (chooseSubMain) {
                            case 1:
                                Booking booking = BookingView.inputBooking();
                                bookingService.addBooking(booking);
                                System.out.println("Add success!!!");
                                break;
                            case 2:
                                BookingView.displayAllBookings(bookingService.getAllBookings());
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
                        int chooseSubMain = InputException.getInput();
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


}
