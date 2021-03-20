public class MergeSort implements MyListInterface {

    public static void mergeSort (double[] tempArray, int first, int last) { /** mergeSort, initiliazes mid and calls the merge functions **/
        if (first == last) {
            return; /** goes onto next call if the sub array now equals its sub array **/
        }

        int mid = (first + last) / 2; /** mid to find the lower remainder, for sub arrays **/

        mergeSort(tempArray, first, mid); /** calls mergeSort for the left sub array **/
        mergeSort(tempArray, mid + 1, last); /** calls mergeSort for the right sub array **/
        merge(tempArray, first, mid + 1, last); /** calls merge to merge the two sub arrays until sorted **/
    }

    public static void merge (double[] tempArray, int firstPoint, int midPoint, int lastPoint) { /** merge, merges sub arrays **/
        int tempIndex = 0;
        int firstIndex = firstPoint;
        int midIndex = midPoint - 1;
        int totalItems = lastPoint - firstIndex + 1; /** all these help access the sub array at certain points for accurate sorting **/

        while (firstIndex <= midIndex && midPoint <= lastPoint) { /** while loop checks if the sub array is accurately looped through **/
            if (tempArray[firstIndex] < tempArray[midPoint]) {
                tempArray[tempIndex++] = tempArray[firstIndex++];
            } else {
                tempArray[tempIndex++] = tempArray[midPoint++];
            }
        }

        while (firstIndex <= midIndex) {
            tempArray[tempIndex++] = tempArray[firstIndex++];
        }

        while (midPoint <= lastPoint) {
            tempArray[tempIndex++] = tempArray[midPoint++];
        }

        for (int i = 0; i < totalItems; i++) { /** for loop through total items, sets temp array as new array (in this case its the same) **/
            tempArray[firstPoint + i] = tempArray[i];
        }
    }

    public void sort(double[] arr) { /** abstract method needing implementation **/
        mergeSort(arr, 0, arr.length - 1);
    }
}