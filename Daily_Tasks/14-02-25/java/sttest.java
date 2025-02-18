import java.lang.reflect.Method;
public class sttest {
	    public static void main(String[] args) {
	        try {
	          
	            st myClass = new st();
	            Method multiplyMethod = st.class.getDeclaredMethod("multiply", int.class, int.class);
	            multiplyMethod.setAccessible(true);
	            int result = (int) multiplyMethod.invoke(myClass, 5, 3);
	            if (result == 15) {
	                System.out.println("Private method test passed");
	            } else {
	                System.out.println("Private method test failed. Expected 15 but got " + result);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}

}
