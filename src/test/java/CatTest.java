import ru.yandex.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.Feline;
import ru.yandex.Predator;

import static org.junit.Assert.assertEquals;

  @RunWith(MockitoJUnitRunner.class)
public class CatTest {


@Mock
Feline feline;

@Test
    public void getSound(){
    Cat cat = new Cat();
   String actual = cat.getSound();
    String expected ="Мяу";
    assertEquals(expected,actual);
}

@Test
public void getFood() throws Exception {
    Cat cat = new Cat(feline);
    cat.getFood();
    Mockito.verify(feline,Mockito.times(1)).eatMeat();

}
}
