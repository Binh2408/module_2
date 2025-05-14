package case_study.utils;

import case_study.model.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        int result = b1.getBookingDate().compareTo(b2.getBookingDate());
        if (result == 0) {
            result = b1.getEndDate().compareTo(b2.getEndDate());
        }
        return result;
    }
}
