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

public class FelineTest {

@Test
    public void checkEatMeatReturns() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actual );
    }

@Test
    public void checkFamilyFeline() {
    Feline feline = new Feline();
    String actual = feline.getFamily();
    assertEquals("Кошачьи",actual);
    }

@Test
    public void checkKittensWithoutCount() {
    Feline feline = new Feline();
    int actual = feline.getKittens();
    assertEquals(1,actual );
    }
@Test
    public void checkKittensCount() {
    Feline feline = new Feline();
    int kittensCount = 2;
    int actual = feline.getKittens(2);
    assertEquals(kittensCount,actual );
    }

}
