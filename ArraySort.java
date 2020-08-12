
public class ArraySort {
	
	

	public static void main(String[] args) {
	
		int[] br= {2,4,6,8};
		int temp=0;
			for(int i=0;i<br.length;i++) {
				for(int j=i+1;j<br.length;j++) {
					if(br[i]>br[j]) {
						temp=br[i];
						br[i]=br[j];
						br[j]=temp;
					}
				}
			}
			  System.out.print("Ascending Order:");
		        for (int i = 0; i < br.length - 1; i++) 
		        {
		            System.out.print(br[i] + ",");
		        }
		
		        System.out.print(br.length-1);
	}

}
