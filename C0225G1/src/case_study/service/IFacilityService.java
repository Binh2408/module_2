package case_study.service;

import case_study.model.Facility;

import java.util.Map;

public interface IFacilityService extends IService<Facility>{
    Map<Facility, Integer> displayFacility();
    Map<Facility, Integer> displayFacilityNeedMaintenance();
}
