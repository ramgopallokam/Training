
public class Practice5 {

	public static void main(String[] args) {
		try {
			int[] ar= {1,2,3};
	    try {
	    	System.out.println(10/0);
	    }
	    catch(ArithmeticException e) {
	    	System.out.println("cant be able to divide by 0");
	    	e.printStackTrace();
	    }
		}
	    catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println("out of array size");
	    	System.out.println(e);
	    }
		
		
	}	
	}


