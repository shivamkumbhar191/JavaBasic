package oops2;

import oops.StudentAccessModi;

public class OtherPackageStudent extends StudentAccessModi{
	
	public void checkStudentVariableAccess() {
	
		rollNo=48;
		age=24;
		//std1.courseId;
		//std1.admissionNo;
	}
	
	public void checkStudentMethodAccess() {
		
		doPublic();
//		doDefault();
		doProtected();
//		std2.doPrivate();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
