package bufferedreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		File f= new File("C:\\Users\\Shivam\\Downloads\\Brfile.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw= new FileWriter(f,true);
		System.out.println("enter the text");
		String data="";
		while(true) {
			data=br.readLine();
			if(data.equalsIgnoreCase("end")) {
				fw.write(data+"\n");
				break;
			}
		}
		System.out.println("-----------------------");
		fw.close();
		

	}

}
