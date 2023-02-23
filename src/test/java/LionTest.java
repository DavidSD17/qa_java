import ru.yandex.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Lion lion;

    @Test
    public void getKittens(){
        lion.getKittens();
        Mockito.verify(lion,Mockito.times(1)).getKittens();
    }
    @Test
    public void doesHaveMane() {
       lion.doesHaveMane();
       Mockito.verify(lion,Mockito.times(1)).doesHaveMane();
    }

}
