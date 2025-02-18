
public class Asserttest {
	    public static void main(String[] args) {
	        Assert calculator = new Assert();
	        int sum = calculator.add(5, 3);
	        assert sum == 8 : "Test failed: Expected 8 but got " + sum;
	        int difference = calculator.subtract(5, 3);
	        assert difference == 2 : "Test failed: Expected 2 but got " + difference;
	        int failedTest = calculator.add(10, 5);
	        assert failedTest == 20 : "Test failed: Expected 20 but got " + failedTest;
	    }
	}


