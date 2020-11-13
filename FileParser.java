import java.io.*;
import java.util.*;

public class FileParser {


  public static void main(String[] args) {

    StringBuilder fullText = new StringBuilder();

    try {
      File f = new File("hamlet.txt");
      Scanner fReader = new Scanner(f);

      while (fReader.hasNextLine()) {
        fullText.append(fReader.nextLine());
      }

    } catch (FileNotFoundException e) {

      System.out.println("File not found");
      e.printStackTrace();
    }

    System.out.println(fullText.length());

    String fullS = fullText.toString();
    String[] words = fullS.split(" ");
    System.out.println(words.length);

    //print the words?
    for (String w : words) {
      System.out.println(w);
    }
  }
}
