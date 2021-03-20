import java.util.Random;

public class HybridSort implements MyListInterface { /** got help from https://www.techiedelight.com/hybrid-quicksort/
                                                        I struggled with this **/
    InsertionSort put = new InsertionSort(); /** uses insertionsort incase **/
    Random r = new Random();


    public void sort (double[] arr) { /** abstract method needing implementation **/
        int left = 0;
        int right = arr.length - 1;
        hybridsort(arr, left , right);
    }


    public void hybridsort (double[] arr, int left, int right) { /** insertionsort incase, also quicksort, combination of both **/
        int pivotIndex;
        int start = 1000;
        while (left < right) {
            pivotIndex = quicksort(arr, left, right);
            if (pivotIndex - left <= start) {
                put.sort(arr); /** uses insertionsort incase **/
            } else{
                hybridsort(arr, left,pivotIndex - 1);
            }
            if (right - pivotIndex <= start) {
                put.sort(arr); /** uses insertionsort incase **/
            } else {
                hybridsort (arr,pivotIndex+1, right);
            }
            return;

        }
    }

    public int quicksort (double[] arr, int left, int right) { /** calls quadratic sort to make sure **/
        return quadraticsort(arr, left, right);
    }

    private int quadraticsort (double[] arr, int left, int right) { /** quadraticsort which is essentially insertionsort **/
        int random = r.nextInt(right + 1 - left) + left;
        double pivot = arr[random];
        swap (arr, right, random);
        int i = left - 1;

        for (int j = left; j <= right - 1;j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }
        }
        swap (arr, i + 1, right);
        return i + 1;
    }
}
