package com.example.test.demo.service;

import com.example.test.demo.Helper.Junit4Helper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class Junit4ServiceTest {

    @InjectMocks
    Junit4Service service;

    @Mock
    Junit4Helper helper;




    @Test
    public void getSubTest(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);
        System.out.println(sub);

    }
}
