package com.dao;

import com.entity.DepartMent;

/**
 * Created by roy.zhuo on 2017/10/18.
 */


public interface DeptDao {

    DepartMent queryDepartmentById(Integer id);


    DepartMent queryDepartmentEmpById(Integer id);



}
