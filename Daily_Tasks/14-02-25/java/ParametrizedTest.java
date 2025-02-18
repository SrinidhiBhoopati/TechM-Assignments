import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParametrizedTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6}) 
    public void testIsEven(int number) {
        assertTrue(Parameterized.isEven(number)); 
    }
}
