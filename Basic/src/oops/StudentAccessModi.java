package oops;

public class StudentAccessModi {
	
	public int rollNo;
	private int admissionNo;
	protected int age;
	int courseId;
	
	public int doPublic() {
		//rollNo=48;
		return rollNo;
	}
	private int doPrivate() {
		//admissionNo=278;
		return admissionNo;
	}
	protected int doProtected() {
		//age=20;
		return age;
	}
	int doDefault() {
		//=93;
		return courseId;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccessModi stdCls= new StudentAccessModi();
		System.out.println(stdCls.rollNo);
		System.out.println(stdCls.age);
		System.out.println(stdCls.courseId);
		System.out.println(stdCls.admissionNo);
		
		System.out.println(stdCls.doDefault());
		System.out.println(stdCls.doProtected());
		System.out.println(stdCls.doPublic());
		System.out.println(stdCls.doPrivate());

	}

}
