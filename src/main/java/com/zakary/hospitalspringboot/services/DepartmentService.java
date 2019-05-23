package com.zakary.hospitalspringboot.services;

import com.zakary.hospitalspringboot.dao.DepartmentDao;
import com.zakary.hospitalspringboot.dao.PositionDao;

import java.util.List;

public interface DepartmentService {
    void insertDepartment(DepartmentDao departmentDao);
    void insertPosition(PositionDao positionDao);
    List<DepartmentDao> getDepartments();
    List<PositionDao> getPositions(DepartmentDao departmentDao);
}