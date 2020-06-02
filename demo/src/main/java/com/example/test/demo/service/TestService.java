package com.example.test.demo.service;

import com.example.test.demo.Helper.TestHelper;
import com.example.test.demo.util.TestUtil;

import java.util.List;

public class TestService {

    TestHelper testHelper;



    public int get(int n1, int n2){
        List<Integer> list = testHelper.getNumbers(n1,n2);

        int sum=TestUtil.sum(list);

        return sum;
    }
}
