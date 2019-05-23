package com.zakary.hospitalspringboot.services.impl;

import com.zakary.hospitalspringboot.dao.DepartmentDao;
import com.zakary.hospitalspringboot.dao.PositionDao;
import com.zakary.hospitalspringboot.exp.BusinessException;
import com.zakary.hospitalspringboot.mapper.DepartmentMapper;
import com.zakary.hospitalspringboot.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    public void insertDepartment(DepartmentDao departmentDao) {
        if(departmentDao.getDepartment_name()==null){
            throw new BusinessException("必要参数为空");
        }
        if(departmentMapper.selectDepartmentByName(departmentDao)!=null){
            throw new BusinessException("此部门已存在");
        }
        departmentMapper.insertDepartment(departmentDao);
    }

    public void insertPosition(PositionDao positionDao) {
        if(positionDao.getDepartment_id()==null||
                positionDao.getPosition_name()==null||
                positionDao.getDepartment_name()==null){
            throw new BusinessException("必要参数为空");
        }
        if(departmentMapper.selectPositionByName(positionDao)!=null){
            throw new BusinessException("此部门下已有此职位");
        }
        if(departmentMapper.insertPosition(positionDao)<1){
            throw new BusinessException("所属部门不存在");
        }
    }

    public List<DepartmentDao> getDepartments() {
        return departmentMapper.selectDepartments();
    }

    public List<PositionDao> getPositions(DepartmentDao departmentDao) {
        if(departmentDao.getDepartment_id()==null){
            throw new BusinessException("必要参数为空");
        }
        return departmentMapper.selectPositions(departmentDao);
    }
}