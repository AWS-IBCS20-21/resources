import java.util.*;

public class matrixExample {

  public matrixExample() {

  }

  public static void main(String[] args) {

    Random myR = new Random();

    float randNum = myR.nextFloat() * 5;
    System.out.println(randNum);

    int[] arr1 = {3,2,1};
    int[][] myMatrix = {{2, 3, 5},{2, 1, 6},{7, 8, 9}};
    //System.out.println(myMatrix);

    for (int[] col : myMatrix) {
      System.out.println("");
      for (int x : col) {
        System.out.print(x);
        System.out.print(" ");
      }
    }
  }

}
