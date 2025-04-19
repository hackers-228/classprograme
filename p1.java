package test;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class AlternateCharactersCopy {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt");
            FileWriter writer = new FileWriter("data2.txt");

            int character;
            int index = 0;

            while ((character = reader.read()) != -1) {
                if (index % 2 == 0) { 
                    writer.write(character);
                }
                index++;
            }

            
            reader.close();
            writer.close();

            System.out.println("Alternate characters copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
		
			
		

	


