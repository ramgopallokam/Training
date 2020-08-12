
public class JTask2 {
      int ctr=0;
    
  	int countCaps(String name) {
			char[] c=name.toCharArray();
			for(int i=0;i<name.length();i++){
				if(c[i]>='A' && c[i]<='Z')
				ctr++;
		         }
		return ctr;	
	}
	public static void main(String[] args) {
      JTask2 task=new JTask2();		
      System.out.println(task.countCaps("dahduG"));
	}

}
