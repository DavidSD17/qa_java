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



@RunWith(Parameterized.class)
public class ParamTestLion {
    private final String sex;
    private boolean hasMane;
    
    public ParamTestLion(String sex){
        this.sex =sex;
    }

    Feline feline = new Feline();

@Parameterized.Parameters(name = "{index}:{0}")
public static Object[][] getTestDataSex() {
    return new Object[][] {
            { "Самка"},
            { "Самец"},
//            { "Лев"},
//            {"Львица"},
//            {"ОН"},
//            {"ОНА"},



    };
}

@Test
    public void Lion() throws Exception {
    Lion lion = new Lion(sex, feline);
}
        // На курсе нас не научили прверять наличие Exception не было ничего такого типа assert throws и т.д. Поэтому просьба подсказать, как это сделать. Заранее большое Спасибо))


    }






