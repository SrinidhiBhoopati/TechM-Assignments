import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;

public class Calexceptiontest {
	


	    @Test
	    public void testDivideByZeroThrowsException() {
	        Calexception calculator = new Calexception();
	        
	        // Verify that IllegalArgumentException is thrown when dividing by zero
	        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
	            calculator.divide(10, 0);
	        });
	        
	        // Optionally verify the exception message
	        assertEquals("Division by zero is not allowed", exception.getMessage());
	    }
	
}
