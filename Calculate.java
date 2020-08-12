
public class Calculate {
int min=0;
int max=0;
int ctr=0;
int ctr1=0;
	int sum(int... x){	
		for(int i=0;i<x.length;i++){
			if(x[i]%3==0){
				System.out.println("number divisible by 3 is :" +x[i]);
			}	
		}
		for(int i=0;i<x.length;i++){
			if(x[i]%2==0){
				ctr++;
			}
			else {
			ctr1++;
			}
		}
		System.out.println("even numbers " +ctr);
		System.out.println("odd numbers " +ctr1);
		
	for(int i=0;i<x.length;i++){
		if(x[i]>max) {
			max=x[i];
		}
	}
		System.out.println("maximum number is: " +max);
		
		return 10;
}
	public static void main(String[] args) {
Calculate c=new Calculate();
c.sum(3,6,1,4,2,5,8);
	}
	}


