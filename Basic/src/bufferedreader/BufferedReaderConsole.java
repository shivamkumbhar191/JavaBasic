package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderConsole {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the text");
		String name=br.readLine();
		System.out.println(name);

	}

}
