package oops;

public class StaticNonStatic {
	
	static int num1=11;
	int num2=48;
	int add;
	
	public static int addition() {
		
		StaticNonStatic stc= new StaticNonStatic();
		stc.add=num1+stc.num2;
		return stc.add;
		//System.out.println(stc.add);
		
	}
	 public void display() {
		 System.out.println(num1);
		 System.out.println(num2);
		 System.out.print(StaticNonStatic.addition());
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStatic stc1=new StaticNonStatic();
		StaticNonStatic.addition();
		stc1.display();
		
	}

}
