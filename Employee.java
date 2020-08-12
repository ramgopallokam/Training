
public class Employee {
	
	String ename;
	int ph_no;
	String adds;
	int pincode;
	String email;
	
	void init() {
	
		ename="Ram";
		ph_no=98987;
		adds="Ap";
		pincode=9494;
		email= "ram@gmail.com";
		
	}
	
	void disp() {
		System.out.println(ename);

		System.out.println(ph_no);

		System.out.println(adds);

		System.out.println(pincode);

		System.out.println(email);
	}

	public static void main(String[] args) {
	
		Employee f= new Employee();
		f.init();
		f.disp();
	}

}
