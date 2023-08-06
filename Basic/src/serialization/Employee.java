package serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	float salary;
	transient int code;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, float salary, int code) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", code=" + code + "]";
	}


}
