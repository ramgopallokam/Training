 
public class Finding {

       String str="john cena";
		String ReplaceFirst(String str,char oldChar , char newChar)
		{
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++){
		if(arr[i]==oldChar)
		arr[i]=newChar;
		}
		String manStr=new String(arr);
		return manStr;
		}

public static void main(String[] args) {

		Finding scm=new Finding();
		String data=scm.ReplaceFirst("test data", 'o', 'w');

		System.out.println(data);

		}

		}
