package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by roy.zhuo on 2017/10/18.
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee queryEmployeeById(Integer id){
        return employeeDao.queryEmployeeDeptById(id);
    }
}
