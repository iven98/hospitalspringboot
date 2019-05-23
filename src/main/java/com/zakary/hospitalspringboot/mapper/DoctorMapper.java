package com.zakary.hospitalspringboot.mapper;

import com.zakary.hospitalspringboot.dao.DoctorDao;
import com.zakary.hospitalspringboot.dao.PageDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface DoctorMapper {
    DoctorDao selectDoctorByCode(DoctorDao doctorDao);
    DoctorDao selectDoctorById(DoctorDao doctorDao);
    int deleteDoctorById(DoctorDao doctorDao);
    int insertDoctor(DoctorDao doctorDao);
    int updateDoctorById(DoctorDao doctorDao);
    List<DoctorDao> selectAllDoctors(PageDao pageDao);
    int getAllDoctorsCounts(String active);
}