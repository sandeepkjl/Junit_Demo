package com.example.test.demo.service;

import com.example.test.demo.Helper.PowerMockHelper;
import com.example.test.demo.dao.PowerMockDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.io.IOException;


@RunWith(PowerMockRunner.class)
@PrepareForTest(PowerMockDao.class)
public class PowerMockServiceTest {

    @Mock
    PowerMockHelper helper;

    @InjectMocks
    PowerMockService service;

    @Before
    public void setUp(){

        ReflectionTestUtils.setField(service,"a", 9);

    }

    @Test
    public void getMultiplyTest() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }
    @Test
    public void getMultiplyTest2() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

    @Test
    public void getMultiplyTest3() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

    @Test
    public void getMultiplyTest4() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

    @Test
    public void getMultiplyTest5_1() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

    @Test
    public void getMultiplyTest6() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
        
    }

    @Test
    public void getMultiplyTest7() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

    @Test
    public void getMultiplyTest8() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

    @Test
    public void getMultiplyTest9() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }


    @Test
    public void getMultiplyTest10() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }
    
    @Test
    public void getMultiplyTest11() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }
    
     @Test
    public void getMultiplyTest12() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }
    
    @Test
    public void getMultiplyTest13() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

    @Test
    public void getMultiplyTest14() throws IOException {


        Mockito.when(helper.getFirstNumber()).thenReturn(8);

        PowerMockito.mockStatic(PowerMockDao.class);

        Mockito.when(PowerMockDao.multiply(8,9)).thenReturn(32);



        System.out.println(service.getMultiply(7));
    }

}
