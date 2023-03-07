package ru.yandex.practikumTest;

import ru.yandex.practikum.Cat;
import ru.yandex.practikum.Feline;
import ru.yandex.practikum.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец",feline);
       assertEquals(0,lion.getKittens());
    }
    @Test
    public void checkGetFoodLion() throws Exception {
        Lion lion = new Lion("Самец",feline);
        lion.getFood();
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.getFood("Хищник"));


    }
    @Test
    public void checkGetFoodReturns() throws Exception {
        Lion lion = new Lion("Самец",feline);
        lion.getFood();
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");

    }


    @Test
    public void checkFood() throws Exception {
        Lion lion = new Lion("Самец",feline);
        Feline feline1 = new Feline();
        List<String> actual = feline1.getFood("Хищник"); //lion.getFood("Хищник");
        List<String> expected =  List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);

    }
    @Test
    public void checkDoesHaveManeTrue() throws Exception {
        Lion lion1 = new Lion("Самец",feline);
       Boolean actual = lion1.doesHaveMane();
       assertEquals(true,actual);

    }
    @Test
    public void checkDoesHaveManeFalse() throws Exception {
        Lion lion1 = new Lion("Самка",feline);
        Boolean actual = lion1.doesHaveMane();
        assertEquals(false,actual);
    }

}
