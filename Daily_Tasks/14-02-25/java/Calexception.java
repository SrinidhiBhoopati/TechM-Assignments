
public class Calexception {
	
	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Division by zero is not allowed");
	        }
	        return a / b;
	    }
	

}
