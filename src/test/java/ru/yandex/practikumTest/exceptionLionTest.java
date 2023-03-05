package ru.yandex.practikumTest;
import ru.yandex.practikum.Feline;
import ru.yandex.practikum.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class exceptionLionTest {

    private final String sex;
    private boolean hasMane;

    public exceptionLionTest(String sex){

        this.sex =sex;
    }

    Feline feline = new Feline();

    @Parameterized.Parameters(name = "{index}:{0}")
    public static Object[][] getTestDataSex() {
        return new Object[][] {
                { "Лев"},
                {"Львица"},
                {"ОН"},
                {"ОНА"},
//                { "Самка"},
//                { "Самец"},

        };
    }

    @Test
    public void throwsExceptionTest() throws Exception{
        Exception exception = assertThrows(Exception.class, () -> {
        Feline feline = new Feline();
        Lion lion = new Lion(sex,feline);
        });
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        String actual = exception.getMessage();
        assertTrue(expected.contains(actual));
    }

//    @Test
//    public void throwsExceptionTest() throws Exception {
//        Feline feline = new Feline();
//        try {
//            Lion lion = new Lion(sex, feline);
//        } catch (Exception e){
//            String text = e.getMessage();
//            assertEquals("Используйте допустимые значения пола животного - самец или самка",e.getMessage());
//            return;
//        } fail();
//    }

}


