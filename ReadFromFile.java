package test;
import java.io.FileReader;
import java.io.*;


public class ReadFromFile {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("file.txt");
			int character;
			while ((character = reader.read())!=-1){
				System.out.print((char)character);
				
			}
			reader.close();
		}catch (IOException e) {
			System.out.print("An errror occured");
			e.printStackTrace();
			
		}
		// TODO Auto-generated method stub

	}

}
