package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public void copydata(File sf, File df) throws IOException {
		if(sf.exists()) {
			df.createNewFile();
			FileInputStream fis= new FileInputStream(sf);
			FileOutputStream fos= new FileOutputStream(df);
			int i=0;
			while((i=fis.read())!=-1) {
				fos.write(i);
				
			}
			System.out.println("file copies");
			fis.close();
			fos.close();
			
		}else {
			System.out.println("file not exists");
		}	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File sf= new File("C:\\Users\\Shivam\\Downloads\\source.txt");
		File df= new File("C:\\Users\\Shivam\\Downloads\\dest.txt");
		CopyFile cf= new CopyFile();
		cf.copydata(sf,df);
		}

}
