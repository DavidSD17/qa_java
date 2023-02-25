package ru.yandex.practikum;

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
    public void getKittens(){
        feline.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens();
    }
    @Test
    public void checkGetFoodLion() throws Exception {

        feline.getFood("Хищник");
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void checkFood() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);

    }
    @Test
    public void checkDoesHaveManeTrue() throws Exception {
        Lion lion1 = new Lion("Самец");
       Boolean actual = lion1.doesHaveMane();
       assertEquals(true,actual);

    }
    @Test
    public void checkDoesHaveManeFalse() throws Exception {
        Lion lion1 = new Lion("Самка");
        Boolean actual = lion1.doesHaveMane();
        assertEquals(false,actual);
    }

}
