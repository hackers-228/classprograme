package test;
import java.io.File;
import java.io.IOException;
public class FileExample {
	public static void main(String[] args) {
		File file=new File("file.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created:"+file.getName());
			}else {
				System.out.println("File already exists");
			}}catch(IOException e) {
				System.out.println("an exception occured");
			}
		}	
}


