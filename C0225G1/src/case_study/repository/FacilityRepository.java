    package case_study.repository;

    import case_study.model.Facility;
    import case_study.model.House;
    import case_study.model.Room;
    import case_study.model.Villa;
    import case_study.utils.ReadAndWriteFile;

    import java.util.ArrayList;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;

    public class FacilityRepository implements IFacilityRepository{
        private final String FACILITY_LIST = "E:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\case_study\\data\\facility.csv";
        private final boolean APPEND = true;
        private final boolean NOT_APPEND = false;

        @Override
        public List<Facility> findAll() {
            throw new UnsupportedOperationException("findAll() is not supported. Use getAllFacilityMap() instead.");
        }

        @Override
        public void delete(String id) {
            throw new UnsupportedOperationException("delete() not implemented yet.");
        }

        @Override
        public void add(Facility facility) {
            List<String> stringList = new ArrayList<>();
            stringList.add(facility.toCSV() +",0");
            ReadAndWriteFile.writeFileToCSV(FACILITY_LIST,stringList,APPEND);
        }

        @Override
        public boolean findId(String id) {
            throw new UnsupportedOperationException("findId() not implemented yet.");
        }

        @Override
        public void update(Facility facility) {
            throw new UnsupportedOperationException("update() not implemented yet.");
        }

        @Override
        public Map<Facility, Integer> getAllFacilityMap() {
            Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
            List<String> stringList = ReadAndWriteFile.readFileToCSV(FACILITY_LIST);
            String[] array;
            for (String line : stringList) {
                array = line.split(",");
                Facility facility;
                int usageCount;
                if (array[0].startsWith("SVVL")) {
                    facility = new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                            Integer.parseInt(array[4]), array[5], array[6], Double.parseDouble(array[7]), Integer.parseInt(array[8]));
                    usageCount = Integer.parseInt(array[9]); // lấy số lần sử dụng ở cuối
                } else if (array[0].startsWith("SVHO")) {
                    facility = new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                            Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7]));
                    usageCount = Integer.parseInt(array[8]);
                } else {
                    facility = new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                            Integer.parseInt(array[4]), array[5], array[6]);
                    usageCount = Integer.parseInt(array[7]);
                }
                facilityMap.put(facility, usageCount);
            }
            return facilityMap;
        }

        @Override
        public Map<Facility, Integer> getFacilityNeedMaintenance() {
            Map<Facility, Integer> maintenanceMap = new LinkedHashMap<>();
                for (Map.Entry<Facility, Integer> entry : getAllFacilityMap().entrySet()) {
                if (entry.getValue() >= 5) {
                    maintenanceMap.put(entry.getKey(), entry.getValue());
                }
            }
            return maintenanceMap;
        }

//        public void increaseUsage(String serviceCode) {
//            for (Facility facility : facilityMap.keySet()) {
//                if (facility.getServiceId().equals(serviceCode)) {
//                    facilityMap.put(facility, facilityMap.get(facility) + 1);
//                    break;
//                }
//            }
//        }
    }
