package case_study.repository;

import case_study.model.Booking;

import java.util.List;

public class BookingRepository implements IBookingRepository{
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
}
