package lokam.ram.gopal;
	




public class Practice3 {
	public static void main(String[] args) {
		try {
		System.out.println(10/3);
		System.out.println(10/4);
		}
		catch(ArithmeticException e) {
			System.out.println("cant divide by 0");
			System.out.println(e);
		}
	}
}
