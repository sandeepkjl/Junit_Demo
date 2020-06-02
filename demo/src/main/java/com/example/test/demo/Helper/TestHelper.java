package com.example.test.demo.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHelper {

    public List<Integer> getNumbers(int n1, int n2){
        return new ArrayList<>(Arrays.asList(n1,n2));
    }
}
