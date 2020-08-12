// Java program to demonstrate working of split(regex, 
// limit) with small limit. 
public class Testing { 
	public static void main(String args[]) 
	{ 
		String str = "+91-9876543231"; 
		String[] arrOfStr = str.split("@", 4); 

		for (String a : arrOfStr) 
			System.out.println(a); 
	} 
} 
