package lab;

class Employee {
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		emp.setId(201);
		emp.setName("anuj");
		emp.setSalary(90000);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}
