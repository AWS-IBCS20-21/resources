// flashcards have word + definition or
// they have problem + solution
import java.util.*;

public class flashcard {

  public static void main(String[] args) {

    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("Mr. Considine", "yellow");
    System.out.println(hm.get("Annie"));
    System.out.println(hm.get("Mr. Considine"));
    hm.put("Amy", "red");
    hm.put("Gwynnie", "red");
    System.out.println(hm.get("Gwynnie"));
    System.out.println(hm.containsKey("Ammy"));
    System.out.println(hm.containsValue("yellow"));
    System.out.println(hm.containsValue("blue"));
    System.out.println("");
    Collection<String> cS = hm.values();
    for (String s : cS) {
      System.out.println(s);
    }


  }
}
