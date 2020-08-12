
public class Validate {
	
	public String onlyNum(String data) {
		char[] ch=data.toCharArray();
		 String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    return rev;  
		}  
			
	
	
	public static void main(String[] args) {

		
		Validate val=new Validate();
		
	System.out.println(val.onlyNum("ramesh"));	
	}

}
