package com.vsicilia.ProjectMgr.service;

import javax.inject.Inject;

public class TestServiceImpl implements TestService {

    private TestDao testDao;

    @Inject
    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public String returnHello() {
        return null;
    }
}
