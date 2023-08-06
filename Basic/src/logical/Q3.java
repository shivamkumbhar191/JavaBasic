package logical;

import java.util.Arrays;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee []emp=new Employee[2];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<emp.length;i++) {
			System.out.println("enter the employee id");
			int id=sc.nextInt();
			System.out.println("enter the employee name");
			String name =sc.next();
			System.out.println("enter the employee salary");
			int salary=sc.nextInt();
			emp[i]=new Employee(id,name,salary);
		
		
		}
		System.out.println(Arrays.toString(emp));
		
		for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].salary<emp[j].salary) {
					int temp=emp[i].salary;
					emp[i].salary=emp[j].salary;
					emp[j].salary=temp;
				}
			}
			System.out.println(emp[i].id+" "+emp[i].name+" "+emp[i].salary);
		}
		

	}

}
