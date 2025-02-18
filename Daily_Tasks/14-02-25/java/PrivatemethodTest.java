	import org.junit.jupiter.api.Test;
	import java.lang.reflect.Method;

	import static org.junit.jupiter.api.Assertions.*;

public class PrivatemethodTest {
	// File: PrivateMethodExampleTest.java


	    // Test case for testing the private method using reflection
	    @Test
	    public void testPrivateMethod() throws Exception {
	        // Creating an instance of PrivateMethodExample
	        Privatemethod example = new Privatemethod();

	        // Accessing the private method using reflection
	        Method method = Privatemethod.class.getDeclaredMethod("greet", String.class);
	        
	        // Making the private method accessible
	        method.setAccessible(true);

	        // Invoking the private method with the value "John"
	        String result = (String) method.invoke(example, "John");

	        // Asserting the expected outcome
	        assertEquals("Hello, John", result);
	    }

	    // Test case for testing the public method which internally calls the private method
	    @Test
	    public void testPublicMethod() {
	        Privatemethod example = new Privatemethod();

	        // Testing the public method
	        String result = example.welcome("Alice");

	        // Verifying the result
	        assertEquals("Hello, Alice", result);
	    }
	}


