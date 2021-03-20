public interface MyListInterface {

    void sort (double[] arr); /** abstract method to be implemented by classes **/

    default boolean check (double[] arr) { /** checks to see if array is sorted **/
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true; /** true means array is sorted correctly **/
    }

    default void swap (double[] arr, int i, int x) { /** swap function, not always used **/ //O(1) space and time
        double tmp = arr[i];
        arr[i] = arr[x];
        arr[x] = tmp;
    }
}
