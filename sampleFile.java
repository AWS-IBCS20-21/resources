import java.io.*;
import java.util.*;

public class sampleFile {


  public static void main(String[] args) {

    try {
      File f = new File("hamlet.txt");
      Scanner fReader = new Scanner(f);

      while (fReader.hasNextLine()) {

        System.out.println(fReader.nextLine());
      }

    } catch (FileNotFoundException e) {

      System.out.println("File not found");
      e.printStackTrace();
    }
  }
}
