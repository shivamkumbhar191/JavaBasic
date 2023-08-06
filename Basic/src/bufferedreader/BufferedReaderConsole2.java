package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderConsole2 {

	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the text ");
		String text="";
		String out="";
		try {
			while(!text.equals(".")) {
				text=br.readLine();
				out=out.concat(text+"\n");
			//	out=out.concat("\n");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("----------------------------------");
		System.out.println(out);
		

	}

}
