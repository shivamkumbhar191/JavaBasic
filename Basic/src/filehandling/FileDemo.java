package filehandling;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\Shivam\\Downloads\\file3.txt");
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println(f.getName());
				System.out.println(f.length());
				System.out.println(f.canWrite());
				System.out.println(f.getPath());
			}else {
				System.out.println("its directory");
			}
		}else {
			System.out.println("file not exists");
		}

	}

}
