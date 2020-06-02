package com.example.test.demo.service;

import com.example.test.demo.Helper.Junit5Helper;

public class Junit5Service {

    Junit5Helper helper;

    public Junit5Service(Junit5Helper helper){
        this.helper=helper;
    }

    public int getAdd(int a, int b){


        return helper.add(a,b);
    }


}
