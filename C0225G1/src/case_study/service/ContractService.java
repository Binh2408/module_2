package case_study.service;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repository.BookingRepository;
import case_study.repository.ContractRepository;
import case_study.repository.IBookingRepository;
import case_study.repository.IContractRepository;

import java.util.List;
import java.util.Queue;

public class ContractService implements IContractService {
    private static final IContractRepository contractRepository = new ContractRepository();
    private static final IBookingRepository bookingRepository = new BookingRepository();
    @Override
    public List<Contract> findAll() {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void add(Contract contract) {

    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void update(Contract contract) {

    }

    private boolean createNewContract(Booking booking, Contract contract) {
        if (contract.getBookingId().startsWith("SVVL") || contract.getBookingId().startsWith("SVHO")) {
            contractRepository.add(contract);
            return true;
        }
        return false;
    }
}
