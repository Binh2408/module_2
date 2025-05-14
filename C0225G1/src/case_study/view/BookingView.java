package case_study.view;

import case_study.common.CustomerValidate;
import case_study.common.FacilityValidate;
import case_study.model.Booking;
import case_study.model.Customer;
import case_study.model.Facility;
import case_study.repository.CustomerRepository;
import case_study.repository.FacilityRepository;
import case_study.repository.ICustomerRepository;
import case_study.repository.IFacilityRepository;
import case_study.service.BookingService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookingView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerRepository customerRepository = new CustomerRepository();
    private static final IFacilityRepository facilityRepository = new FacilityRepository();
    public static Booking inputBooking() {
        String bookingId;
        LocalDate bookingDate;
        LocalDate startDate;
        LocalDate endDate;
        String customerId = "";
        String serviceId;

        while (true) {
            try {
                System.out.println("Enter Booking ID: ");
                bookingId = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter Booking Date(yyyy-MM-dd): ");
                bookingDate = LocalDate.parse(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter Start Date(yyyy-MM-dd): ");
                startDate = LocalDate.parse(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter End Date(yyyy-MM-dd): ");
                endDate = LocalDate.parse(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("------Customer List------");
        List<Customer> customerList = customerRepository.findAll();
        for (Customer customer: customerList){
            System.out.println(customer.getCustomerId()+" - "+customer.getName());
        }
        while (true) {
            try {
                System.out.println("Enter Customer ID from list: ");
                customerId = scanner.nextLine();
                CustomerValidate.validateId(customerId);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("------Service List------");
        Map<Facility, Integer> facilityMap = facilityRepository.getAllFacilityMap();
        for (Facility facility : facilityMap.keySet()) {
            System.out.println(facility.getServiceId() + " - " + facility.getServiceName());
        }
        while (true) {
            try {
                System.out.println("Enter Service ID from list: ");
                serviceId = scanner.nextLine();
                boolean isFound = false;
                for (Facility facility : facilityMap.keySet()) {
                    if (facility.getServiceId().equals(serviceId)) {
                        isFound = true;
                        if (serviceId.startsWith("SVVL")) {
                            FacilityValidate.validateVillaId(serviceId);
                        } else if (serviceId.startsWith("SVHO")) {
                            FacilityValidate.validateHouseId(serviceId);
                        } else if (serviceId.startsWith("SVRO")) {
                            FacilityValidate.validateRoomId(serviceId);
                        } else {
                            throw new Exception("service ID not format.");
                        }

                        break;
                    }
                }
                if (!isFound) {
                    throw new Exception("Service ID not found in list.");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return new Booking(bookingId,bookingDate,startDate,endDate,customerId,serviceId);
    }
    public static void displayAllBookings(Set<Booking> bookingSet) {
        if (bookingSet == null || bookingSet.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        System.out.println("------Booking List------");
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

}
