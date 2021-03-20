public class QuickSort implements MyListInterface {

    public void sort (double[] arr) { /** abstract method needing implementation **/
        int left = 0;
        int right = arr.length - 1;
        quicksort (arr, left, right); /** sorted quicksort **/
    }

    public void quicksort (double[] arr, int left, int right) { /** quicksort method similar to mergeSort **/
        if (left < right) {
            int piv = partition (arr, left, right);
            quicksort (arr, left, piv - 1); /** calls quicksort to sort the leftmost sub array **/
            quicksort (arr,piv + 1, right); /** calls quicksort to sort through rightmost sub array **/
        }
    }

    public int partition (double[] arr, int left, int right) { /** partition to find the piv of the array **/
        double pivot = right;

        int countIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < arr[(int) pivot]) {
                double tmp = arr[countIndex];
                arr[countIndex] = arr[i];
                arr[i] = tmp;
                countIndex++;
            }
        }
        double temp = arr[(int) pivot]; /** could use the swap function instead, but it swaps left - 1 with the right **/
        arr[(int) pivot] = arr[countIndex]; /** most element of the sub array **/
        arr[(int) pivot] = arr[countIndex];
        arr[countIndex] = temp;

        return countIndex;
    }
}