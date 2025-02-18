import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
	 public void testAdd() {
	        // Create an instance of the Calculator class
	        calculator calculator = new calculator();
	        
	        // Call the add method and store the result
	        int result = calculator.add(2, 3);
	        
	        // Assert that the result is 5
	        assertEquals(5, result, "The add method should return the sum of two numbers");
	    }
}
