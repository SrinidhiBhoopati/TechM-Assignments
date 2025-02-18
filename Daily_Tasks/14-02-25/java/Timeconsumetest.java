import static org.junit.jupiter.api.Assertions.fail;
	import org.junit.jupiter.api.Test;
public class Timeconsumetest {
	
	    @Test
	    public void testPerformTaskTimeout() {
	        Timeconsume task = new Timeconsume();
	        long startTime = System.currentTimeMillis();
	        
	        try {
	            task.performTask();
	        } catch (InterruptedException e) {
	            fail("The task was interrupted: " + e.getMessage());
	        }
	        
	        long endTime = System.currentTimeMillis();
	        long executionTime = endTime - startTime;

	        if (executionTime > 2000) {
	            fail("The task took too long to execute. Expected < 2 seconds, but it took " + executionTime + "ms.");
	        }
	    }
	}

