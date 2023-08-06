package filehandling;

import java.io.File;

public class DeleteFile {
	public void deleteFile(File f) {
		if(f.exists()) {
			if(f.delete()) {
				System.out.println(f.getName()+" is deleted");
			}else {
				System.out.println("file not deleted");
			}
		}else {
			System.out.println("File does not exists");
		}
		
	}

	public static void main(String[] args) {
		DeleteFile df= new DeleteFile();
		File f=new File("C:\\Users\\Shivam\\Downloads\\file2.txt");
		df.deleteFile(f);
	}

}
