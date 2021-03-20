public class InsertionSort implements MyListInterface {

    public void sort (double[] arr) { /** abstract method needing implementation **/
        for (int i = 1; i < arr.length; i++) { /** standard for loop through array length **/
            double tmp = arr[i]; /** temporary copy **/
            int j = i -1;
            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp; /** copies back the sorted array from tmp **/
        }
    }
}