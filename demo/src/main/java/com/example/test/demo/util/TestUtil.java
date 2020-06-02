package com.example.test.demo.util;

import com.example.test.demo.dao.TestDao;

import java.util.List;

public class TestUtil {

    //TestDao testDao;

    public static Integer sum(List<Integer> list){

        TestDao testDao =new TestDao();

        Integer sum = testDao.getSum(list.get(0),list.get(1));
        System.out.println(sum);

        return sum;
    }
}
