import java.util.Arrays;
public class Driver {

  //java Driver SIZE ALGO [STYLE]
  //STYLE is optional, because it defaults to a random array if omitted
  //ALGO choices: bubble,selection,insertion,test
  //STYLE choices: random,equal,sorted,reversed
  public static void main(String[]args){
    if(args.length < 2){
      System.out.println("usage: java Driver SIZE ALGO [STYLE]");
      System.out.println("supported ALGO: bubble,selection,insertion,test");
      System.out.println("supported STYLE: random,equal,sorted,reversed");
    }else{


      int[] randData = new int[Integer.parseInt(args[0])];

      //generates the array
      //overhead: 1 random array generation.
      if(args.length < 3 || args[2].equals("random")){
        for(int i = 0 ; i < randData.length; i++) {
          randData[i] = (int)(Math.random()*10000);
        }
      } else if(args[2].equals("equal")){
        int onlyValue = (int)(Math.random()*10000);
	      for (int i = 0; i < randData.length; i++) {
          randData[i] = onlyValue;
        }
      } else if(args[2].equals("sorted")){
	      for (int i = 0; i < randData.length; i++) {
          randData[i] = (int)(Math.random()*10000);
        }
        Arrays.sort(randData);
      } else if(args[2].equals("reversed")){
        int[] tempData = new int[randData.length];
        for (int i = 0; i < tempData.length; i++) {
          tempData[i] = (int)(Math.random()*10000);
        }
        Arrays.sort(tempData);
        int index = 0;
        for (int i = tempData.length-1; i >= 0; i--) {
          randData[index] = tempData[i];
          index++;
        }
      }

      if(args[1].equals("bubble")){
        Sorts.bubbleSort(randData);
      }
      else if(args[1].equals("selection")){
        Sorts.selectionSort(randData);
      }
      else if(args[1].equals("insertion")){
        Sorts.insertionSort(randData);
      }

      //TEST MODE! This lets you see if your algorithm fails
      //for a particular type of array, or size of array.
      //This is not meant to be a timed test...
      else if(args[1].equals("test")){

        int[] randDataBubble = Arrays.copyOf(randData,randData.length);
        int[] randDataSelection = Arrays.copyOf(randData,randData.length);
        int[] randDataInsertion = Arrays.copyOf(randData,randData.length);
        Arrays.sort(randData);
        Sorts.bubbleSort(randDataBubble);
        Sorts.selectionSort(randDataSelection);
        Sorts.insertionSort(randDataInsertion);

        if( Arrays.equals(randData,randDataBubble)){
          System.out.println("Bubble Correct!");
        }else{
         System.out.println("Bubble Not Correct!!!!!!!!!11oneeleven");
        }

        if( Arrays.equals(randData,randDataSelection)){
          System.out.println("Selection Correct!");
        }else{
         System.out.println("Selection Not Correct!!!!!!!!!11oneeleven");
        }

        if( Arrays.equals(randData,randDataInsertion)){
          System.out.println("Insertion Correct!");
        }else{
         System.out.println("Insertion Not Correct!!!!!!!!!11oneeleven");
        }
      }
    }
  }
}

  // public static void main(String[]args){
  //   //args 0 must be size of the Array
  //   //args 1 has a few choices:
  //     //"bubble" - bubbleSort
  //     //"selection" - selectionSort
  //     //"insertion" - insertionSort
  //     //"test1" - bubbleSort test (gives feedback)
  //     //"test2" - ^ but selectionSort
  //     //"test3" - ^ but insertionSort
  //
  //   if(args[1].equals("bubble")){
  //     Sorts.bubbleSort(randData);
  //   }
  //   else if (args[1].equals("selection")) {
  //     Sorts.selectionSort(randData);
  //   }
  //   else if (args[1].equals("insertion")) {
  //     Sorts.insertionSort(randData);
  //   }
  //   else if (args[1].equals("test1")){ //bubbleSort test
  //     int[] randDataBubble = Arrays.copyOf(randData,randData.length);
  //     Arrays.sort(randData);
  //     Sorts.bubbleSort(randDataBubble);
  //
  //
  //     if( Arrays.equals(randData,randDataBubble)){
  //       System.out.println("Bubble Correct!");
  //     }else{
  //      System.out.println("Bubble Not Correct!!!!!!!!!11oneeleven");
  //     }
  //   }
  //   else if (args[1].equals("test2")) { //selectionSort test
  //     int[] randDataBubble = Arrays.copyOf(randData,randData.length);
  //     Arrays.sort(randData);
  //     Sorts.selectionSort(randDataBubble);
  //
  //
  //     if( Arrays.equals(randData,randDataBubble)){
  //       System.out.println("Selection Correct!");
  //     }else{
  //      System.out.println("Selection Not Correct!!!!!!!!!11oneeleven");
  //     }
  //   }
  //   else { //insertionSort
  //     int[] randDataBubble = Arrays.copyOf(randData,randData.length);
  //     Arrays.sort(randData);
  //     Sorts.insertionSort(randDataBubble);
  //
  //
  //     if( Arrays.equals(randData,randDataBubble)){
  //       System.out.println("Insertion Correct!");
  //     }else{
  //      System.out.println("Insertion Not Correct!!!!!!!!!11oneeleven");
  //     }
  //   }
  // }
