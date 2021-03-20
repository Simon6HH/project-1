public class SelectionSort implements MyListInterface {

    public void sort (double[] arr) { /** abstract method needing implementation **/
        for (int tempCount = 0; tempCount < arr.length;) { /** loops through array length  **/
            int first = tempCount;
            for (int i = tempCount + 1; i < arr.length; i++) { /** loops through array again **/
                if (arr[first] > arr[i]) {
                    first = i;
                }
            }
            swap (arr, first, tempCount++); /** swap function, swaps array, first element, and temp counter **/
        }
    }
}