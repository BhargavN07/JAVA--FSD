package AssistedPracticeProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Update {
   public static void main(String args[]) throws IOException {
     
      String filePath = "D://input.txt";
     
      Scanner sc = new Scanner(new File("C:/Users/Bhargav/OneDrive/Desktop/aabb.txt"));
    
      StringBuffer buffer = new StringBuffer();
     
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      System.out.println("Contents of the file: "+fileContents);
      
      sc.close();
      String oldLine = "No preconditions and no impediments. Simply Easy Learning!";
      String newLine = "Enjoy the free content";
     
      fileContents = fileContents.replaceAll(oldLine, newLine);
      
      FileWriter writer = new FileWriter("C:/Users/Bhargav/OneDrive/Desktop/123456.txt");
      System.out.println("");
      System.out.println("new data: "+fileContents);
      writer.append(fileContents);
      writer.flush();
   }
}

