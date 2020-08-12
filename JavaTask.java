
public class JavaTask {
	

	String ReplaceFirst(String var, char find, char replace) {
	
		char[] arr= var.toCharArray();
		for(int i=0;i<var.length();i++)
		{
			if(arr[i]== find)
				arr[i]=replace;
		}
		String str=new String(arr);
		return str;
		
		
		
	}

	public static void main(String[] args) {
	
		JavaTask task=new JavaTask();
		    String ad= task.ReplaceFirst("john cena",'n','o');
          System.out.println(ad);
	}

}
