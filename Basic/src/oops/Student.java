package oops;

public class Student {
	int id;
	String name;
	int phy;
	int chem;
	int maths;
	double per;
	
	public void acceptDetails(int sid,String sname,int ph,int che , int mat) {
		id=sid;
		name=sname;
		phy=ph;
		chem=che;
		maths=mat;
	}
	public void calculatePer() {
		per=(phy+chem+maths)/3;
	}
	public void dispalyDetails() {
		String grade;
		if(per>=75) {
			grade="distiction";
		}
		else if(per>=60){
			grade="first class";	
		}
		else {
			grade="second class";
		}
		System.out.println(id+" "+name+" "+phy+" "+chem+" "+maths+" "+per+" "+grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.acceptDetails(201, "shivam", 89, 67, 94);
		stud.calculatePer();
		stud.dispalyDetails();

	}

}
