package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserSrlzDsrlzn {
	Scanner sc = new Scanner(System.in);
	UserTransient s = new UserTransient();

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Shivam\\Downloads\\UserData.txt");
		UserSrlzDsrlzn s = new UserSrlzDsrlzn();
		s.writeStudentData(f);
		s.readStudentData(f);
	}

	public void readStudentData(File f) {
		try {
			if(f.exists()) {
				System.out.println("enter the passwprd");
				if(sc.next().equals(s.getUpass())) {
					ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
					UserTransient u=(UserTransient) ois.readObject();
					System.out.println(u);
					ois.close();
				}else {
					System.out.println("incorrect passsword");
				}	
			}else {
				System.out.println("file not exists...");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void writeStudentData(File f) {
		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));

			System.out.println("enter user id");
			s.setUid(sc.nextInt());
			System.out.println("enter user name");
			s.setUname(sc.next());
			System.out.println("enter user pass");
			s.setUpass(sc.next());
			oos.writeObject(s);
			System.out.println("-------------------");
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
