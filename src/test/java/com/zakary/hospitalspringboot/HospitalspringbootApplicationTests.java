package com.zakary.hospitalspringboot;

import com.zakary.hospitalspringboot.dao.DoctorDao;
import com.zakary.hospitalspringboot.dao.PrescriptionDao;
import com.zakary.hospitalspringboot.services.DoctorService;
import com.zakary.hospitalspringboot.services.PatientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.zakary.hospitalspringboot.dao.PageDao;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class HospitalspringbootApplicationTests {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

    private Logger logger;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test1(){
        logger= LoggerFactory.getLogger(getClass());
        DoctorDao doctorDao=new DoctorDao();
        doctorDao.setCert_code("1");
        doctorDao.setPassword("123456");
        doctorService.login(doctorDao);
    }
    @Test
    public void test20(){
        PrescriptionDao prescriptionDao=new PrescriptionDao();
        prescriptionDao.setPatient_cert_code("1");
        List<PrescriptionDao> prescriptionDaos=patientService.getAllPrescriptionByCert(prescriptionDao);
        logger=LoggerFactory.getLogger(getClass());
        logger.info(prescriptionDaos.size()+"");
    }
}
