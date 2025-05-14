package case_study.repository;

import case_study.model.Booking;

import java.util.Queue;
import java.util.Set;

public interface IBookingRepository extends  IRepository<Booking> {
    Set<Booking> getAllBookings();
    void addBooking(Booking booking);
    Queue<Booking> getBookingQueueForContract();
}
