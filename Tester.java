import java.util.Arrays;
public class Tester {

  public static void main(String[] args) {

    int[] bubsort1 = new int[]{5,1,12,-5,16};
    int[] bubsort2 = new int[]{2,3,4,5,1};
    int[] bubsort3 = new int[]{6,1,2,3,4,5};
    Sorts.bubbleSort(bubsort1);
    Sorts.bubbleSort(bubsort2);
    Sorts.bubbleSort(bubsort3);
    System.out.println(Arrays.toString(bubsort1));
    System.out.println(Arrays.toString(bubsort2));
    System.out.println(Arrays.toString(bubsort3));
  }
}
