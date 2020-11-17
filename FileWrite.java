import java.io.*;
import java.util.*;

public class FileWrite {


  public static void main(String[] args) {

    StringBuilder fullText = new StringBuilder();

    try {
      File f = new File("writeToThis.txt");

      System.out.println(f.canRead());
      System.out.println(f.canWrite());
      System.out.println(f.getPath());

      FileWriter fw = new FileWriter("writeToThis.txt");
      fw.write("I am writing here");
      fw.write("\ndoes this delete");
      fw.close();

      //Scanner fReader = new Scanner(f);

      //while (fReader.hasNextLine()) {
        //fullText.append(fReader.nextLine());
      //}

    } catch (IOException e) {

      System.out.println("File not found");
      e.printStackTrace();
    }
  }
}
