package oops;

public class TqStudent extends StudentAccessModi{
	
	public void checkStudentVariableAccess() {
		StudentAccessModi stdAccess= new StudentAccessModi();
		
		stdAccess.rollNo=48;
		stdAccess.age=20;
		stdAccess.courseId=96;
		//stdAccess.admissionNo=278;
		
		System.out.println(stdAccess.rollNo+" "+stdAccess.age+" "+stdAccess.courseId);
	
	}	
	public void checkStudentMethodAccess() {
		StudentAccessModi stdAccess2= new StudentAccessModi();
		// stdAccess2.doDefault();
		 stdAccess2.doProtected();
		 stdAccess2.doPublic();
		 //stdAccess2.doPrivate();
		 
		doDefault();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TqStudent ts= new TqStudent();
		ts.checkStudentVariableAccess();
		ts.checkStudentMethodAccess();

	}

}
