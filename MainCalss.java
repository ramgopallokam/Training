class Calc{
	int x=20;
	public Calc(){
		System.out.println("def cons");
	}	
	public Calc(int x) {
		System.out.println("args cons");
	}
	void sum() {
		System.out.println(x);
	}
}
	class ScCalc extends Calc{	
		public ScCalc(){
			super();
			System.out.println("child cons");
		}
	}
public class MainCalss {
	public static void main(String[] args) {
		ScCalc dew=new ScCalc();
		dew.sum();
	}

}
