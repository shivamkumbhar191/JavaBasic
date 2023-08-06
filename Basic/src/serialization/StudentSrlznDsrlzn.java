package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentSrlznDsrlzn {
	Scanner sc= new Scanner(System.in);
	public void readStudentData(File f) {
		try {
			if(f.exists()) {
				ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
				Student s=(Student) ois.readObject();
				System.out.println(s);
				ois.close();
			}else{
				System.out.println("file nor exists");
			}
		}catch(Exception e) {
			e.printStackTrace();;
		}
		
		
	}
	public void writeStudentData(File f) {
		
			try {
				if(!f.exists()) {
					f.createNewFile();
				}
				ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(f));
				Student st[]= new Student[3];
				for(int i=0;i<st.length;i++) {
					Student s= new Student();
					
					System.out.println("enter student id");
					s.setId(sc.nextInt());
					System.out.println("enter student name");
					s.setName(sc.next());
					System.out.println("enter student marks");
					s.setMarks(sc.nextInt());
					
					st[i]=s;
				}
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		File f= new File("C:\\Users\\Shivam\\Downloads\\StudentData.txt");
		StudentSrlznDsrlzn s= new StudentSrlznDsrlzn();
		s.writeStudentData(f);
		s.readStudentData(f);
	}
}
