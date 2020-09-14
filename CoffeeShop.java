import java.util.*;

public class CoffeeShop {

  public static void main(String[] args) {

    System.out.println("Welcome to the Coffee Shop");
    System.out.println("");

    Scanner userIn = new Scanner(System.in);
    String name = userIn.next();

    System.out.println("Is your name, " + name);

    Scanner orderIn = new Scanner(System.in);
    String order = orderIn.nextLine();

    //Change the order
    String newOrder = order.replace('a', 'z');
    System.out.println(order);
    System.out.println(newOrder);

    System.out.println("this is new");

  }

}
