
public class onlyNum {

	int ctr=0;
	void Num(String data) {
		char[] ch=data.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<'9') {
				ctr++;
			}
			
	}
		if(ctr==10) {
			System.out.println("array contains 10 numbers");
			}
			else{
				System.out.println("lessthan 10 numbers");
			}
			}
	public static void main(String[] args) {
		onlyNum num=new onlyNum();
		num.Num("12348");
	}

}
