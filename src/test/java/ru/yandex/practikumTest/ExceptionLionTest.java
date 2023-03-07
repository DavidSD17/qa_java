package ru.yandex.practikumTest;
import ru.yandex.practikum.Feline;
import ru.yandex.practikum.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class ExceptionLionTest {

    private final String sex;
    private boolean hasMane;

    public ExceptionLionTest(String sex){

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


}


