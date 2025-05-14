package case_study.repository;

import case_study.model.Booking;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWriteFile;

import java.time.LocalDate;
import java.util.*;

public class BookingRepository implements IBookingRepository{
    private final String BOOKING_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\case_study\\data\\booking.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public List<Booking> findAll() {
        throw new UnsupportedOperationException("findAll() is not supported. Use getAllFacilityMap() instead.");

    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("delete() not implemented yet.");
    }

    @Override
    public void add(Booking booking) {

    }

    @Override
    public boolean findId(String id) {
        throw new UnsupportedOperationException("findId() not implemented yet.");
    }

    @Override
    public void update(Booking booking) {
        throw new UnsupportedOperationException("update() not implemented yet.");
    }

    @Override
    public Set<Booking> getAllBookings() {
        Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        List<String> stringList = ReadAndWriteFile.readFileToCSV(BOOKING_LIST);
        String[]array;
        for (String line: stringList){
            array = line.split(",");
            Booking booking = new Booking(array[0],LocalDate.parse(array[1]),LocalDate.parse(array[2]),LocalDate.parse(array[3]),array[4],array[5]);
            bookingSet.add(booking);
        }
        return bookingSet;
    }

    @Override
    public void addBooking(Booking booking) {
        List<String> stringList = new ArrayList<>();
        stringList.add(booking.toCSV());
        ReadAndWriteFile.writeFileToCSV(BOOKING_LIST,stringList,APPEND);
    }

    @Override
    public Queue<Booking> getBookingQueueForContract() {
        Set<Booking> bookingSet = getAllBookings();
        return new LinkedList<>(bookingSet);
    }
}
