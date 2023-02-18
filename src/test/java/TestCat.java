import com.example.Cat;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

@Mock
     Cat cat;

@Test
    public void getSound(){
    cat.getSound();
    Mockito.verify(cat, Mockito.times(1)).getSound();
}

@Test
public void getFood() throws Exception {
    cat.getFood();
    Mockito.verify(cat,Mockito.times(1)).getFood();

}
}
