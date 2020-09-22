import java.util.*;

public class Course {

  String name;
  int numStudents;
  int period;

  public Course() {
    name = "IB Computer Science";
    numStudents = 8;
    period = 6;
  }

  public String returnName() {
    return name;
  }

  public int returnNumStudents() {
    return numStudents;
  }

  public int returnPeriod() {
    return period;
  }

  public void changeNumStudents(int newNum) {
    numStudents = newNum;
  }

  public static void main(String[] args) {
    Course ibcs = new Course();

    ibcs.changeNumStudents(10);

    System.out.println(ibcs.returnNumStudents());

    System.out.println("Pick one of the following numbers.");
    System.out.println("1. Course name");
    System.out.println("2. Course number of students");
    System.out.println("3. Course period");

    Scanner choice = new Scanner(System.in);
    String ch = choice.next();

    if (ch.equals("1")) {
      System.out.println(ibcs.returnName());
    }
    if (ch.equals("2")) {
      System.out.println(ibcs.returnNumStudents());
    }
    if (ch.equals("3")) {
      System.out.println(ibcs.returnPeriod());
    }
  }

}
