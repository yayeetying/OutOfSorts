import java.util.Arrays;

public class Sorts {

  //Bubble sort of an int array.
  //Upon completion, the elements of the array will be in increasing order.
  //param data is the elements to be sorted.
  public static void bubbleSort(int[] data) { //doesn't return anything cuz you're modifying the int[]
    for (int i = 1; i <= data.length; i++) { //# of times you need to go thru the array
      //System.out.println(Arrays.toString(data));
      int swap = 0; //number of times elements were swapped in 1 loop of the array
      for (int k = 0; k < data.length-i; k++) { //everytime, you check one less element on the right
        //also though, i starts with 1 so you won't get index outta bounds error
        if (data[k] > data[k+1]) {
          int temp = data[k];
          data[k] = data[k+1];
          data[k+1] = temp;
          swap++;
        }
      }
      if (swap == 0) { //if you never needed to swap elements, means array is sorted
        //break;
        i = data.length;
      }
    }
    //System.out.println();
  }
}
