import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SimpleTest {
	public class SimpleTaskTest {

	    @Test
	    public void testPerformTask() {
	        Simple task = new Simple();
	        String result = task.performTask();
	        assertEquals("Task completed!", result, "The task was not completed successfully.");
	    }

	    @Test
	    @Disabled("This test is skipped temporarily.")
	    public void testPerformTaskWithSkip() {
	        Simple task = new Simple();
	        String result = task.performTask();
	        assertEquals("Task completed!", result, "This test is skipped.");
	    }
	}

}
