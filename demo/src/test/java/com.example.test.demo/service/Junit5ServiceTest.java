package com.example.test.demo.service;

import com.example.test.demo.Helper.Junit5Helper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Junit5ServiceTest {

    @InjectMocks
    Junit5Service service;

    @Mock
    Junit5Helper helper;

    @Test
    public void getAddTest(){

        Mockito.when(helper.add(7,4)).thenReturn(13);

        int add= service.getAdd(7,4);

        System.out.println(add);
    }
}
