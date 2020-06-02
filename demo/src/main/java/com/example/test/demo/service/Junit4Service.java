package com.example.test.demo.service;

import com.example.test.demo.Helper.Junit4Helper;

public class Junit4Service {

    Junit4Helper helper;

    public Junit4Service(Junit4Helper helper){
        this.helper=helper;
    }

    public int getSub(int a , int b){

        return helper.sub(a,b);
    }
}
