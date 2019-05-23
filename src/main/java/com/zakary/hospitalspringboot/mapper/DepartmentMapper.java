package com.zakary.hospitalspringboot.mapper;

import com.zakary.hospitalspringboot.dao.DepartmentDao;
import com.zakary.hospitalspringboot.dao.PositionDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface DepartmentMapper {
    int insertDepartment(DepartmentDao departmentDao);
    int insertPosition(PositionDao positionDao);
    List<DepartmentDao> selectDepartments();
    List<PositionDao> selectPositions(DepartmentDao departmentDao);
    int updateDepartment(DepartmentDao departmentDao);
    int updatePosition(PositionDao positionDao);
    DepartmentDao selectDepartmentByName(DepartmentDao departmentDao);
    PositionDao selectPositionByName(PositionDao positionDao);
}