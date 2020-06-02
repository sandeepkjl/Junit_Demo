package com.example.test.demo.service;

import com.example.test.demo.Helper.PowerMockHelper;
import com.example.test.demo.dao.PowerMockDao;
import com.example.test.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.IOException;

public class PowerMockService {

    PowerMockHelper helper;

    @Value("${abc.def}")
    private int a;

    public PowerMockService(PowerMockHelper helper){
        this.helper = helper;

    }

    public int getMultiply( int n2) throws IOException {


         int n1= helper.getFirstNumber();



         return PowerMockDao.multiply(n1,a);
    }
}
