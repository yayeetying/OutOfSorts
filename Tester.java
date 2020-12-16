import java.util.Arrays;
public class Tester {

  public static void main(String[] args) {

    int[] bubsort1 = new int[]{5,1,12,-5,16};
    Sorts.bubbleSort(bubsort1);
    System.out.println(Arrays.toString(bubsort1));
  }
}
