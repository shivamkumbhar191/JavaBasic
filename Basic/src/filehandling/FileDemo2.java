package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {
	public void writeData(File f) {
		try {
			f.createNewFile();
			FileOutputStream fo=new FileOutputStream(f);
			String data="I like java";
			byte [] arr=data.getBytes();
			fo.write(arr);
			System.out.println("Data added");
			fo.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void readData(File f) {
		try {
			if(f.exists()) {
				FileInputStream fi= new FileInputStream(f);
				int i=0;
				while((i=fi.read())!=-1) {
					System.out.print((char)i);
				}
				fi.close();
			}else{
				System.out.println("File not exists...");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		FileDemo2 fd= new FileDemo2();
		File f=new File("C:\\Users\\Shivam\\Downloads\\file1.txt");
	//	fd.writeData(f);
		fd.readData(f);

	}

}
