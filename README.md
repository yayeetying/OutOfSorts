# OutOfSorts
3 sorting methods (bubbleSort, selectionSort, insertionSort)

Findings from testing requirements (Driver.java):

-For equal or sorted arrays:

  -selection sort's time grows quadratically as data size increases because selectionSort doesn't stop early (when the array is already ordered)

  -bubble and insertion sorts, however, have linear time, because they stop early when the array is already sorted (and they won't do the swapping of elements)

-For random or reversed arrays:

  -all 3 sorts exhibit O(N^2) behavior (double size of array, quadruple the time it takes to run)

  -*even though reverse sorted is the "worst case scenario", it has faster times than the random arrays because of branch prediction (CPU predicts some answers to the T/F statement and does the work ahead of time); think math hw prediction example
  
