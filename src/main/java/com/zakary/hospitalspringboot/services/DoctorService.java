package com.zakary.hospitalspringboot.services;
import com.zakary.hospitalspringboot.dao.DoctorDao;
import com.zakary.hospitalspringboot.dao.PageDao;

import java.util.List;

public interface DoctorService {
    void login(DoctorDao doctorDao);
    List<DoctorDao> getDoctorAll(PageDao pageDao);
    void insertDoctor(DoctorDao doctorDao);
    void updateInformation(DoctorDao doctorDao);
    void deleteDoctor(DoctorDao doctorDao);
    int getDoctorsCounts(String active);
}