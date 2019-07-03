package com.vsicilia.ProjectMgr.service;

import com.vsicilia.ProjectMgr.dao.TestDao;

import javax.inject.Inject;

public class TestServiceImpl implements TestService {

    TestDao testDao;

    @Inject
    public TestServiceImpl(TestDao testDao){
        this.testDao = testDao;
    }

    @Override
    public String returnHello() {
        return testDao.returnHello();
    }
}
