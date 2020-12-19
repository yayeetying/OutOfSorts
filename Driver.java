import java.util.Arrays;
public class Driver{

  public static void main(String[]args){
    //args 0 must be size of the Array
    //args 1 has a few choices:
      //"bubble" - bubbleSort
      //"selection" - selectionSort
      //"insertion" - insertionSort
      //"test1" - bubbleSort test (gives feedback)
      //"test2" - ^ but selectionSort
      //"test3" - ^ but insertionSort
    int[] randData = new int[Integer.parseInt(args[0])];

    for(int i = 0 ; i < randData.length; i++){
      randData[i] =(int)(Math.random()*10000);
    }

    if(args[1].equals("bubble")){
      Sorts.bubbleSort(randData);
    }
    else if (args[1].equals("selection")) {
      Sorts.selectionSort(randData);
    }
    else if (args[1].equals("insertion")) {
      Sorts.insertionSort(randData);
    }
    else if (args[1].equals("test1")){ //bubbleSort test
      int[] randDataBubble = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.bubbleSort(randDataBubble);


      if( Arrays.equals(randData,randDataBubble)){
        System.out.println("Bubble Correct!");
      }else{
       System.out.println("Bubble Not Correct!!!!!!!!!11oneeleven");
      }
    }
    else if (args[1].equals("test2")) { //selectionSort test
      int[] randDataBubble = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.selectionSort(randDataBubble);


      if( Arrays.equals(randData,randDataBubble)){
        System.out.println("Selection Correct!");
      }else{
       System.out.println("Selection Not Correct!!!!!!!!!11oneeleven");
      }
    }
    else { //insertionSort
      int[] randDataBubble = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.insertionSort(randDataBubble);


      if( Arrays.equals(randData,randDataBubble)){
        System.out.println("Insertion Correct!");
      }else{
       System.out.println("Insertion Not Correct!!!!!!!!!11oneeleven");
      }
    }
  }
}
