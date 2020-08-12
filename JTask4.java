
public class JTask4 {
	boolean isNum(String data) {		
		char[] c= data.toCharArray();
		for(int i=0;i<data.length();i++) {
			if(c[i]>='0' && c[i]<='9' )
				return true;	
		}
		return false;
		}
	public static void main(String[] args) {
		JTask4 task=new JTask4();
		System.out.println(task.isNum("Sshsh"));
	}

}
