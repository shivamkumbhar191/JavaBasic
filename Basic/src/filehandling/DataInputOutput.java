package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutput {
	public void readData(File f) {
		try {
			if(f.exists()) {
				DataInputStream dio=  new DataInputStream(new FileInputStream(f));
				
				System.out.println(dio.readInt());
				System.out.println(dio.readUTF());
				System.out.println(dio.readFloat());
				dio.close();
			}else {
				System.out.println("File not exists");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void writeData(File f) {
		try {
			f.createNewFile();
			DataOutputStream dos= new DataOutputStream(new FileOutputStream(f));
			dos.writeInt(48);
			dos.writeUTF("shivam kumbhar");
			dos.writeFloat(78.49f);
			System.out.println("data added...");
			dos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputOutput dio= new DataInputOutput();
		File f=new File("C:\\Users\\Shivam\\Downloads\\data1.txt");
		//dio.writeData(f);
		dio.readData(f);

	}



}
