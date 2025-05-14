package case_study.service;

import case_study.model.Booking;

import java.util.Queue;
import java.util.Set;

public interface IBookingService extends IService<Booking> {
    Set<Booking> getAllBookings();
    void addBooking(Booking booking);
    Queue<Booking> getBookingQueueForContract();
}
