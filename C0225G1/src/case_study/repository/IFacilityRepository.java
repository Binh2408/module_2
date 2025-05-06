package case_study.repository;

import case_study.model.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository extends IRepository<Facility> {
    Map<Facility, Integer> getAllFacilityMap();
    Map<Facility, Integer> getFacilityNeedMaintenance();
}
