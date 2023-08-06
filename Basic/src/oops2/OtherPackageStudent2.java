package oops2;

import oops.StudentAccessModi;
import oops.TqStudent;

public class OtherPackageStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccessModi std= new StudentAccessModi();
		std.rollNo=11;
//		std.age=20;
//		std.courseId=96;
//		std.admissionNo=278;
//		
		std.doPublic();
//		std.doDefault();
//		std.doProtected();
//		std.doPrivate();
		
		
		
		TqStudent tqstd= new TqStudent();
		tqstd.rollNo=72;
//		tqstd.age=20;
//		tqstd.courseId=96;
//		tqstd.admissionNo=278;
		
		
		tqstd.doPublic();
//		tqstd.doDefault();
//		tqstd.doProtected();
//		tqstd.doPrivate();
		
		
		OtherPackageStudent ostd= new OtherPackageStudent();
		ostd.rollNo=72;
//		ostd.age=20;
//		ostd.courseId=96;
//		ostd.admissionNo=278;
		
		
		ostd.doPublic();
//		ostd.doDefault();
//		ostd.doProtected();
//		ostd.doPrivate();	
	}

}
