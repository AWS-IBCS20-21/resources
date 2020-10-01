public class Calculator {

  int num1;
  int num2;

  public Calculator(int n) {
    num1 = n;
  }

  public int factorial(int num) {
    int result = 1;
    for (int i = 0; i < num - 1; i++) {
      result = result * (num - i);
      //System.out.println(result);
    }

    return result;
  }

  public static void main(String[] args) {

    Calculator c = new Calculator(5);
    System.out.println(c.factorial());
  }
}
