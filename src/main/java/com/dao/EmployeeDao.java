package com.dao;

import com.entity.Employee;

/**
 * Created by roy.zhuo on 2017/10/18.
 */


public interface EmployeeDao {

    //通过外键关联查询
    Employee queryEmployeeDeptById(Integer dept_id);

    Employee queryEmployeeById(Integer id);
}
