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

    }

    @Test
    public void getSubTest2(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest3(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest4(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest5(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }


    @Test
    public void getSubTest6(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest7(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest8(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest9(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest10(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest11(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }

    @Test
    public void getSubTest12(){

        Mockito.when(helper.sub(10,2)).thenReturn(5);
        int sub=service.getSub(10,2);

    }



}
