package com.service;

import com.dao.DeptDao;
import com.entity.DepartMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by roy.zhuo on 2017/10/18.
 */

@Service
public class DeptService {

    @Autowired
    private DeptDao deptDao;

    public DepartMent queryDepartMentById(Integer id){
        return  deptDao.queryDepartmentEmpById(id);
    }
}
