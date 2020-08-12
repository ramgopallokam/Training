
public class Substring {
	String mySubStr(String data, int index) {
		
		char[] str=data.toCharArray();
		for(int i=0;i<str.length;i++) {
			if(str[i]==index) {
				str[i]=str[i+2];
			}
			
		}
		String str1=new String(str);
	
		
		return str1;
		
	}
	
	
	

	public static void main(String[] args) {
	
		Substring string=new Substring();
		System.out.println(string.mySubStr("ramgopal", 2));
	}

}
