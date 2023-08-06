package assignment;

public class Department {
	
	int id;
	String name;
	
	public void details(int a,String nm) {
		id=a;
		name=nm;
	}
	public void show() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
		Student st= new Student ();
	//	st.detailsStudent(11, "ajay");
		st.showStudent();
		
	}

}
class Student{
	int rollNo;
	String name;
	Department dpt;
	
	public void detailsStudent(int rollnum,String nme,Department dep) {
		rollNo= rollnum;
		name=nme;
		dpt=dep;
	}
	public void showStudent() {
		System.out.println(rollNo+" "+name+" "+dpt);
	}
	
}