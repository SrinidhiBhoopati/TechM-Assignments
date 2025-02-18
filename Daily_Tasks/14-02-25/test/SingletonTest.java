import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;
	public class SingletonTest {
	    @Test
	    public void testSingletonInMultiThreadedEnvironment() throws InterruptedException {
	        int numberOfThreads = 10;
	        Thread[] threads = new Thread[numberOfThreads];
	        Singleton[] instances = new Singleton[numberOfThreads];

	        // Create threads to test Singleton instance access
	        for (int i = 0; i < numberOfThreads; i++) {
	            threads[i] = new Thread(() -> {
	                instances[(int) (Thread.currentThread().getId() % numberOfThreads)] = Singleton.getInstance();
	            });
	            threads[i].start();
	        }
	        for (Thread thread : threads) {
	            thread.join();
	        }
	        Singleton firstInstance = instances[0];
	        for (int i = 1; i < numberOfThreads; i++) {
	            assertSame(firstInstance, instances[i], "Singleton instance is not the same for all threads");
	        }
	    
	}

}
