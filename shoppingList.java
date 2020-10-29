import java.util.*;

public class shoppingList {

  public shoppingList() {

  }

  public static void main(String[] args) {

    shoppingList s = new shoppingList();

    ArrayList<String> g = new ArrayList<String>();

    //g.add(2);
    g.add("Cookies");
    g.add("Salmon");
    g.add("Candy Corn");
    g.add("Cheese");
    g.add("Apple");
    g.add("Cereal");
    g.add("Cheese");

    System.out.println(g.size());

    for (String purchase : g) {
      System.out.println(purchase);
    }

    // As it turns out, we already have a bunch of cheese..
    // or the cheese is moldy at the store.
    // we want to remove it from the list.

    g.remove("Cheese");
    System.out.println(g.size());

    for (String purchase : g) {
      System.out.println(purchase);
    }

    // We want to replace apple with Honey Crisp Apple
    int pos = g.indexOf("Apple");

    g.set(pos , "Honey Crisp Apple");

    System.out.println("");
    for (String purchase : g) {
      System.out.println(purchase);
    }

  }


}
