package com.zakary.servicesImpl;

import com.zakary.dao.Doctor;
import com.zakary.mapper.DoctorMapper;
import com.zakary.services.RootManagerDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RootManagerDocotorServiceImpl implements RootManagerDoctorService {
    @Autowired
    private DoctorMapper dao;

    public List<Doctor> getDoctorAll(){
        return dao.selectDoctorAll();
    }
    public int insertDoctor(Doctor doctor){
        return dao.insert(doctor);
    }

    @Override
    public int updateInformation(Doctor doctor) {
        return dao.updateByPrimaryKey(doctor);
    }

    @Override
    public int deleteDoctor(Doctor doctor) {
        return dao.deleteByPrimaryKey(doctor.getDoctorid());
    }
}
