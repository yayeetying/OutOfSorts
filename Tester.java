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

    int[] snowing = new int[0];
    Sorts.bubbleSort(snowing);
    System.out.println(Arrays.toString(snowing));
    System.out.println("rev sorted");
    int[] today = new int[]{10,9,8,7,6,5,4,3,2,1,0};
    int[] yay = new int[]{96, 74, 56, 54, 31, 19, 7, 3, -6, -37, -59};
    Sorts.bubbleSort(today);
    Sorts.bubbleSort(yay);
    System.out.println(Arrays.toString(today));
    System.out.println(Arrays.toString(yay));
    System.out.println("already sorted");
    Sorts.bubbleSort(today);
    Sorts.bubbleSort(yay);
    System.out.println(Arrays.toString(today));
    System.out.println(Arrays.toString(yay));
    System.out.println("almost sorted");
    today[7] = 89; today[3] = 59; today[9] = 1;
    yay[2] = -10000; yay[4] = -67; yay[7] = 88;
    System.out.println(Arrays.toString(today));
    Sorts.bubbleSort(today);
    System.out.println(Arrays.toString(today));
    System.out.println(Arrays.toString(yay));
    Sorts.bubbleSort(yay);
    System.out.println(Arrays.toString(yay));
    System.out.println("replicates");
    int[] snowball = new int[]{2,6,0,-1,1,1,6,9,100,2,2,2,7,8,-1,-1};
    Sorts.bubbleSort(snowball);
    System.out.println(Arrays.toString(snowball));
  }
}
