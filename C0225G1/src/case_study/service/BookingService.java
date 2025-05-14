package case_study.service;

import case_study.model.Booking;
import case_study.repository.BookingRepository;
import case_study.repository.FacilityRepository;
import case_study.repository.IBookingRepository;
import case_study.repository.IFacilityRepository;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BookingService implements IBookingService{
    private final IBookingRepository bookingRepository = new BookingRepository();
    private final IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public List<Booking> findAll() {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void add(Booking booking) {

    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public Set<Booking> getAllBookings() {
        return  bookingRepository.getAllBookings();
    }

    @Override
    public void addBooking(Booking booking) {
        bookingRepository.addBooking(booking);
        facilityRepository.increaseUsage(booking.getServiceId());
    }

    @Override
    public Queue<Booking> getBookingQueueForContract() {
        return bookingRepository.getBookingQueueForContract();
    }
}
