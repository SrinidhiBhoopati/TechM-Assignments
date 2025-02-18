
	public class Singleton {
	    private static Singleton instance;

	    // Private constructor to prevent instantiation
	    private Singleton() {}

	    // Public method to get the instance, synchronized for thread safety
	    public static synchronized Singleton getInstance() {
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }
	}


