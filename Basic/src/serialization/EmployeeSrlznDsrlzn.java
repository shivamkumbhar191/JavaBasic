package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSrlznDsrlzn {
	Scanner sc= new Scanner(System.in);
	Employee ep= new Employee();
	List<Employee> al= new ArrayList<>();

	public static void main(String[] args) {
		File f= new File("C:\\Users\\Shivam\\Downloads\\EmployeeData.txt");
		EmployeeSrlznDsrlzn e= new EmployeeSrlznDsrlzn();
		e.writeEmployeeData(f);
		e.readEmployeeData(f);
	}

	@SuppressWarnings("unchecked")
	public void readEmployeeData(File f) {
		try {
			if(f.exists()) {
					ObjectInputStream ois = new  ObjectInputStream(new FileInputStream(f)) ;
					al= (ArrayList<Employee>) ois.readObject();
					System.out.println(al);
					ois.close();
			}else {
				System.out.println("file not exists");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void writeEmployeeData(File f) {
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(f));
			for(int i=0;i<2;i++) {
				System.out.println("enter employee id");
				int eid=sc.nextInt();
				System.out.println("enter employee name");
				String ename=sc.next();
				System.out.println("enter employee salary");
				float sal=sc.nextInt();
				System.out.println("enter employee code");
				int ecode=sc.nextInt();
				al.add(new Employee(eid,ename,sal,ecode));
			}
			al.add(new Employee(3,"c",300,55));
			oos.writeObject(al);
			oos.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
