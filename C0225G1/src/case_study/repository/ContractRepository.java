package case_study.repository;

import case_study.model.Contract;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    private final String CONTRACT_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\case_study\\data\\constract.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public List<Contract> findAll() {
        List<Contract> contractList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileToCSV(CONTRACT_LIST);
        String[] array;
        for (String line: stringList) {
            array = line.split(",");
            Contract contract = new Contract(array[0], array[1], Double.parseDouble(array[2]),Double.parseDouble(array[3]));
            contractList.add(contract);
        }
        return contractList;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void add(Contract contract) {
        List<String> stringList = new ArrayList<>();
        stringList.add(contract.toCSV());
        ReadAndWriteFile.writeFileToCSV(CONTRACT_LIST,stringList,APPEND);
    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void update(Contract contract) {
        List<Contract> contractList = findAll();
        for (int i = 0; i < contractList.size(); i++) {
            if (contractList.get(i).getContractNumber().equals(contract.getContractNumber())) {
                contractList.set(i,contract);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Contract contract1: contractList) {
            stringList.add(contract1.toCSV());
        }
        ReadAndWriteFile.writeFileToCSV(CONTRACT_LIST,stringList,NOT_APPEND);
    }
}
