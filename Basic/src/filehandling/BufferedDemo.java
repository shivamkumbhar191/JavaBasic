package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public void writeData(File f) {
		try {
			f.createNewFile();
			
			BufferedOutputStream bs= new BufferedOutputStream(new FileOutputStream(f));
			String data="I like javaScript";
			byte [] arr=data.getBytes();
			bs.write(arr);
			System.out.println("Data added");
			bs.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void readData(File f) {
		try {
			if(f.exists()) {
				BufferedInputStream bi= new BufferedInputStream(new FileInputStream(f));
				int i=0;
				while((i=bi.read())!=-1) {
					System.out.print((char)i);
				}
				bi.close();
			}else{
				System.out.println("File not exists...");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		BufferedDemo fd= new BufferedDemo();
		File f=new File("C:\\Users\\Shivam\\Downloads\\file2.txt");
		fd.writeData(f);
		fd.readData(f);

	}
}
