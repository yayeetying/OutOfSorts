public class Sorts {

  //Bubble sort of an int array.
  //Upon completion, the elements of the array will be in increasing order.
  //param data  the elements to be sorted.
  public static void bubbleSort(int[] data) { //doesn't return anything cuz you're modifying the int[]
    for (int i = 0; i < data.length; i++) { //# of times i need to go thru the array
      int swap = 0;
      for (int k = 0; k < data.length-i; k++) { //everytime, i check one less element on the right
        if (data[k] > data[k+1]) {
          int temp = data[k];
          data[k] = data[k+1];
          data[k+1] = temp;
          swap++;
        }
      }
      if (swap == 0) {
        //break;
        i = data.length;
      }
    }
  }
}
