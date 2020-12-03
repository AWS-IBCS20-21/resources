import java.util.*;

class SearchTime {

  public SearchTime() {

  }

  public boolean binarySearch(int arr[], int start, int stop, int key){

    if (stop >= 1) {
      if (start < stop) {

        //calculate the middle index by averaging the start and stop
        int midIndex = (start + stop)/2;
        int midEle = arr[midIndex];

        //if midEle greater than key
        if (midEle > key) {
          stop = midIndex;
          return binarySearch(arr, start, stop, key);
          //run binarySearch on first half
        }
        //if midEle less than key
        else if (midEle < key) {
          start = midIndex + 1;
          return binarySearch(arr, start, stop, key);
          //run binarySearch on second half
        }
        //key must be the midEle
        else {
          return true;
        }
      }
    }
    else {
      return false;
    }



    //

    return false;

  }


  int partition(int arr[], int low, int high)
  {
      int pivot = arr[high];
      int i = (low-1); // index of smaller element
      for (int j=low; j<high; j++)
      {
          // If current element is smaller than the pivot
          if (arr[j] < pivot)
          {
              i++;
              // swap arr[i] and arr[j]
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }
      // swap arr[i+1] and arr[high] (or pivot)
      int temp = arr[i+1];
      arr[i+1] = arr[high];
      arr[high] = temp;
      return i+1;
  }

  void sort(int arr[], int low, int high)
  {
      if (low < high)
      {
          /* pi is partitioning index, arr[pi] is
            now at right place */
          int pi = partition(arr, low, high);

          // Recursively sort elements before
          // partition and after partition
          sort(arr, low, pi-1);
          sort(arr, pi+1, high);
      }
  }

  static void printArray(int arr[])
  {
      int n = arr.length;
      for (int i=0; i<n; ++i)
          System.out.print(arr[i]+" ");
      System.out.println();
  }

  private static int getRandomNumberInRange(int min, int max) {

      if (min >= max) {
        throw new IllegalArgumentException("max must be greater than min");
      }

      Random r = new Random();
      return r.nextInt((max - min) + 1) + min;
  }

  public static void main(String[] args) {
    SearchTime sT = new SearchTime();


    int sizeArray = 50;
    int[] arr = new int[sizeArray];

    for (int i = 0; i < sizeArray; i++) {
      arr[i] = (getRandomNumberInRange(1,1000));
    }

    //System.out.println("Unsorted: ");
    //sT.printArray(arr);
    double start = System.nanoTime();

    System.out.println("Sorting...");
    sT.sort(arr, 0, arr.length-1);
    System.out.println("Sorted: ");
    sT.printArray(arr);

    double finish = System.nanoTime();
    double t = (finish - start) / 1000000000;
    System.out.print("Sorting took ");
    System.out.print(t);
    System.out.println(" seconds\n\n\n\n");

    //Start binary Search
    int key = 777;
    Boolean check = sT.binarySearch(arr, 0, arr.length, key);
    if (check) {
      System.out.println("Found key");
    }
    else {
        System.out.println("Did not find key");
    }
  }
}
