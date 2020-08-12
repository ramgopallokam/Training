
public class JTask6 {

	static	boolean isEqual(String str1, String str2) {
		 
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		if(arr1.length==arr2.length) {

	   for(int i=0; i<arr1.length;i++) {
		   
		   if(!(arr1[i]==arr2[i] || arr1[i]==(arr2[i]+32) || arr1[i]==(arr2[i]-32))) {
			   
			   return false;
			   
		   }
	   }
	   
		}
		else {
			return false;
		}
				
			
				
		return true;
	
	}	
	
	
	public static void main(String[] args) {
	
		System.out.println(isEqual("raM","RAM"));
	}

}                                             
