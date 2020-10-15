public class sampleProblems {

  public sampleProblems() {

  }

  //problem 1: given any string. return a string where each
  // character in the string is doubled
  // "hello" --> "hheelllloo"
  public String doubleChar(String s) {
    String result = "";

    char[] cArray = s.toCharArray();
    //System.out.println(cArray);

    for (char c : cArray) {
      result = result + c;
      result = result + c;
    }

    return result;
  }

  //problem 2: tests to see whether or not a string has
  //its prefix repeat again later in the String
  //the integer input tells you how many characters the
  //prefix is.
  // "hello", 2 --> false, because the prefix 'he' does not
  // repeat
  // "baseball", 2 --> true
  public boolean prefixAgain(String s, int n) {

    return false;
  }


  // Return an integer. Either 0, 1 or 2. 0 = bad
  // 1 = good and 2 = great.
  // A tea party is good if both the tea and the candy
  // are at least 5. However if either the tea or The
  // candy are more than double the amount of the other
  // then the party is great. In all cases, however,
  // the party is bad if either the tea or the candy
  // is less than 5.
  public int teaParty(int tea, int candy) {

    return 0;
  }





  public static void main(String[] args) {

    sampleProblems sample = new sampleProblems();

    //test problem 1
    System.out.println(sample.doubleChar("Hi Computer Class"));


    //test problem 2
  }
}
