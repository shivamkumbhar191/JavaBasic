package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public void writeData(File f) {
		try {
			f.createNewFile();
			FileWriter fo=new FileWriter(f);
			String data="I like programming";
			fo.write(data);
			System.out.println("Data added");
			fo.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void readData(File f) {
		try {
			if(f.exists()) {
				FileReader fi= new FileReader(f);
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
		CharacterStream cs= new CharacterStream();
		File f=new File("C:\\Users\\Shivam\\Downloads\\char1.txt");
		cs.writeData(f);
		cs.readData(f);

	}

}
