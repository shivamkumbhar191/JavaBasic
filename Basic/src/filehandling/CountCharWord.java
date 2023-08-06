package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CountCharWord {
	public void countchar(File f) throws IOException {
		if(f.exists()) {
			FileInputStream fi= new FileInputStream(f);
			int i;
			int count=0;
			while((i=fi.read())!=-1) {
				if((char)i==' ') {
					count++;
				}
			}
			int totalchar=(int) (f.length()-count);
			int totalwords=count+1;
			System.out.println("total number of character :"+totalchar);
			System.out.println("total number of Words :"+totalwords);
			fi.close();
		}else {
			System.out.println("file not exists...");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\Shivam\\Downloads\\file3.txt");
		CountCharWord cw = new CountCharWord();
		cw.countchar(f);
	}

}
