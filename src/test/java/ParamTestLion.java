import ru.yandex.Lion;
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
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    Lion lion =  Mockito.mock(Lion.class);

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
    Lion lion1 = new Lion(sex);
//    Mockito.verify(lion, Mockito.times(1)).doesHaveMane();

}


}
