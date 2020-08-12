
public class JTask3 {
	int ctr=0;
	boolean isCapsonly(String name) {
		char[] c=name.toCharArray();
		for(int i=0;i<name.length();i++){
			if(c[i]>='A' && c[i]<='Z')
			ctr++;
		}
		if(ctr==name.length()) {
			return true;
		}
		return false;
	}	
	public static void main(String[] args) {
		JTask3 task=new JTask3();
		System.out.println(task.isCapsonly("RAM"));

	}

}
