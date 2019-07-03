package com.vsicilia.ProjectMgr.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class TestDaoImpl implements TestDao {

//    public TestDaoImpl(){
//
//    }

    @Override
    public String returnHello() {
        return "hello... calling home";
    }
}
