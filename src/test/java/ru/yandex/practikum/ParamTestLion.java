package ru.yandex.practikum;

import ru.yandex.practikum.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class ParamTestLion {
    private final String sex;
    private boolean hasMane;
    
    public ParamTestLion(String sex){
        this.sex =sex;
    }


@Parameterized.Parameters
public static Object[][] getTestDataSex() {
    return new Object[][] {
            { "Самка"},
            { "Самец"},
            { "Лев"},
            {"Львица"},
            {"ОН"},
            {"ОНА"},



    };
}

@Test
    public void Lion() throws Exception {
    Lion lion = new Lion(sex);


}


}
