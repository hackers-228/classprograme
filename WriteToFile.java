package test;
import java.io.FileWriter;
import java.io.*;
public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("file.txt");
			writer.write("hello,this is a file handling in java");
			writer.close();
			System.out.println("successfully wrote to the file");
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
