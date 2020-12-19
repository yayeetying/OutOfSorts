import java.util.Arrays;
import java.util.Random; //the Random object

public class Tester {

  //ok but can i introduce you to Arrays.equals()?
  public static boolean allEqual(int[] a1, int[] a2) {
    boolean equal = true;
    for (int k = 0; k < a1.length && equal; k++) {
      if (a1[k] != a2[k]) equal = false;
    }
    return equal;
  }

  //param whichSort - input 1, does bubbleSort; 2, selectionSort; 3, insertionSort
  public static int badGoRun(int whichSort) {
    //here no seed is provided, so it uses the clock as a seed
    //this can be used to produce a random seed for a different Random object!
    Random rng = new Random();
    int badGo = 0;
    for (int times = 0; times < 10000; times++) {
      int[] randomArray = new int[1000];
      for(int i =  0; i < 1000; i++ ){
        randomArray[i] = rng.nextInt() % 1000;
      }
      int[] actualSort = Arrays.copyOf(randomArray,1000);
      if (whichSort == 1) {
        Sorts.bubbleSort(randomArray);
      }
      else if (whichSort == 2) {
        Sorts.selectionSort(randomArray);
      }
      else {Sorts.insertionSort(randomArray);}
      Arrays.sort(actualSort);
      if (!allEqual(randomArray, actualSort)) { //if they're not equal, debugging time
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(actualSort));
        System.out.println();
        badGo++;
      }
    }
    return badGo;
  }

  public static void main(String[] args) {

    int[] bubsort1 = new int[]{5,1,12,-5,16};
    int[] bubsort2 = new int[]{2,3,4,5,1};
    int[] bubsort3 = new int[]{6,1,2,3,4,5};
    int[] snowing = new int[0];
    int[] today = new int[]{10,9,8,7,6,5,4,3,2,1,0};
    int[] yay = new int[]{96, 74, 56, 54, 31, 19, 7, 3, -6, -37, -59};
    int[] snowball = new int[]{2,6,0,-1,1,1,6,9,100,2,2,2,7,8,-1,-1};

    System.out.println("BUBBLESORT");
    int[] cbubsort1 = Arrays.copyOf(bubsort1, 5);
    int[] cbubsort2 = Arrays.copyOf(bubsort2, 5);
    int[] cbubsort3 = Arrays.copyOf(bubsort3, 6);
    Sorts.bubbleSort(cbubsort1);
    Sorts.bubbleSort(cbubsort2);
    Sorts.bubbleSort(cbubsort3);
    System.out.println(Arrays.toString(cbubsort1));
    System.out.println(Arrays.toString(cbubsort2));
    System.out.println(Arrays.toString(cbubsort3));

    int[] csnowing = Arrays.copyOf(snowing, 0);
    Sorts.bubbleSort(csnowing);
    System.out.println(Arrays.toString(csnowing));
    System.out.println("rev sorted");
    int[] ctoday = Arrays.copyOf(today, 11);
    int[] cyay = Arrays.copyOf(yay, 11);
    Sorts.bubbleSort(ctoday);
    Sorts.bubbleSort(cyay);
    System.out.println(Arrays.toString(ctoday));
    System.out.println(Arrays.toString(cyay));
    System.out.println("already sorted");
    Sorts.bubbleSort(ctoday);
    Sorts.bubbleSort(cyay);
    System.out.println(Arrays.toString(ctoday));
    System.out.println(Arrays.toString(cyay));
    System.out.println("almost sorted");
    ctoday[7] = 89; ctoday[3] = 59; ctoday[9] = 1;
    cyay[2] = -10000; cyay[4] = -67; cyay[7] = 88;
    System.out.println(Arrays.toString(ctoday));
    Sorts.bubbleSort(ctoday);
    System.out.println(Arrays.toString(ctoday));
    System.out.println(Arrays.toString(cyay));
    Sorts.bubbleSort(cyay);
    System.out.println(Arrays.toString(cyay));
    System.out.println("replicates");
    int[] csnowball = Arrays.copyOf(snowball, 16);
    Sorts.bubbleSort(csnowball);
    System.out.println(Arrays.toString(csnowball));
    System.out.println();

    //badGoRun; doing bubbleSort, so input 1
    System.out.println(badGoRun(1));

    System.out.println("~~~~~~~~~~~~");

    System.out.println("SELECTIONSORT");
    int[] c2bubsort1 = Arrays.copyOf(bubsort1, 5);
    int[] c2bubsort2 = Arrays.copyOf(bubsort2, 5);
    int[] c2bubsort3 = Arrays.copyOf(bubsort3, 6);
    Sorts.selectionSort(c2bubsort1);
    Sorts.selectionSort(c2bubsort2);
    Sorts.selectionSort(c2bubsort3);
    System.out.println(Arrays.toString(c2bubsort1));
    System.out.println(Arrays.toString(c2bubsort2));
    System.out.println(Arrays.toString(c2bubsort3));

    int[] c2snowing = Arrays.copyOf(snowing, 0);
    Sorts.selectionSort(c2snowing);
    System.out.println(Arrays.toString(c2snowing));
    System.out.println("rev sorted");
    int[] c2today = Arrays.copyOf(today, 11);
    int[] c2yay = Arrays.copyOf(yay, 11);
    Sorts.selectionSort(c2today);
    Sorts.selectionSort(c2yay);
    System.out.println(Arrays.toString(c2today));
    System.out.println(Arrays.toString(c2yay));
    System.out.println("already sorted");
    Sorts.selectionSort(c2today);
    Sorts.selectionSort(c2yay);
    System.out.println(Arrays.toString(c2today));
    System.out.println(Arrays.toString(c2yay));
    System.out.println("almost sorted");
    c2today[7] = 89; c2today[3] = 59; c2today[9] = 1;
    c2yay[2] = -10000; c2yay[4] = -67; c2yay[7] = 88;
    System.out.println(Arrays.toString(c2today));
    Sorts.selectionSort(c2today);
    System.out.println(Arrays.toString(c2today));
    System.out.println(Arrays.toString(c2yay));
    Sorts.selectionSort(c2yay);
    System.out.println(Arrays.toString(c2yay));
    System.out.println("replicates");
    int[] c2snowball = Arrays.copyOf(snowball, 16);
    Sorts.selectionSort(c2snowball);
    System.out.println(Arrays.toString(c2snowball));
    System.out.println();

    //badGoRun; doing selectionSort, so input 2
    System.out.println(badGoRun(2));

    System.out.println("~~~~~~~~~~~~");

    System.out.println("INSERTIONSORT");
    int[] c3bubsort1 = Arrays.copyOf(bubsort1, 5);
    int[] c3bubsort2 = Arrays.copyOf(bubsort2, 5);
    int[] c3bubsort3 = Arrays.copyOf(bubsort3, 6);
    Sorts.insertionSort(c3bubsort1);
    Sorts.insertionSort(c3bubsort2);
    Sorts.insertionSort(c3bubsort3);
    System.out.println(Arrays.toString(c3bubsort1));
    System.out.println(Arrays.toString(c3bubsort2));
    System.out.println(Arrays.toString(c3bubsort3));

    int[] c3snowing = Arrays.copyOf(snowing, 0);
    Sorts.insertionSort(c3snowing);
    System.out.println(Arrays.toString(c3snowing));
    System.out.println("rev sorted");
    int[] c3today = Arrays.copyOf(today, 11);
    int[] c3yay = Arrays.copyOf(yay, 11);
    Sorts.insertionSort(c3today);
    Sorts.insertionSort(c3yay);
    System.out.println(Arrays.toString(c3today));
    System.out.println(Arrays.toString(c3yay));
    System.out.println("already sorted");
    Sorts.insertionSort(c3today);
    Sorts.insertionSort(c3yay);
    System.out.println(Arrays.toString(c3today));
    System.out.println(Arrays.toString(c3yay));
    System.out.println("almost sorted");
    c3today[7] = 89; c3today[3] = 59; c3today[9] = 1;
    c3yay[2] = -10000; c3yay[4] = -67; c3yay[7] = 88;
    System.out.println(Arrays.toString(c3today));
    Sorts.insertionSort(c3today);
    System.out.println(Arrays.toString(c3today));
    System.out.println(Arrays.toString(c3yay));
    Sorts.insertionSort(c3yay);
    System.out.println(Arrays.toString(c3yay));
    System.out.println("replicates");
    int[] c3snowball = Arrays.copyOf(snowball, 16);
    Sorts.insertionSort(c3snowball);
    System.out.println(Arrays.toString(c3snowball));
    System.out.println();

    //badGoRun; doing insertionSort, so input 3
    System.out.println(badGoRun(3));
  }

}
