package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	public void readData(File f) throws IOException {
		if(f.exists()) {
			FileInputStream fi= new FileInputStream(f);
			int i;
			while((i=fi.read())!=-1) {
				if(((char)i)=='8' || ((char)i)=='0') {
					System.out.print((char)i);
				}
			}
			fi.close();
		}else {
			System.out.println("file not exists...");
		}
	}

	public void addNum(File f) throws IOException {
		if(f.exists()) {
			FileInputStream fi= new FileInputStream(f);
			int i;
			int sum=0;
			while((i=fi.read())!=-1) {
				if(i>=48 && i<=57) {
					sum=sum+i-48;
				}
				
			}
			System.out.println(sum);
			fi.close();
		}else {
			System.out.println("file not exists...");
		}
	}
	public void writeData(File f) throws IOException {
		String text="sachin scored 80 runs in odi match";
		FileOutputStream fo= new FileOutputStream(f);
		byte arr[]=text.getBytes();
		fo.write(arr);
		System.out.println("file created");
		fo.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\Shivam\\Downloads\\file3.txt");
		CreateFile cf = new CreateFile();
	//	cf.writeData(f);
	//	cf.readData(f);
	//	cf.addNum(f);
	}

}
