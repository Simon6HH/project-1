public class BubbleSort implements MyListInterface {

    public void sort (double[] arr) { /** abstract method needing implementation **/
        boolean switched = true;
        for (int i = 0; switched && i < arr.length; i++) { /** boolean for loop that checks to see if the element was**/
            switched = false;                               /** switched or not**/
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j + 1] < arr[j]) {
                    swap (arr, j + 1, j);
                    switched = true;
                }
            }
        }
    }
}
