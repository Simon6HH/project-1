import java.text.DecimalFormat;
import java.util.Random;

public class Test {

    public static void main (String[] args) {
        SelectionSort selection = new SelectionSort();
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        HybridSort hybrid = new HybridSort();  /** initializing objects **/

        Random r = new Random();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);

        double[][] tests = new double[10][];

        for (int i = 1; i <= 10; i++) { /** sizes 50000 - 500000 arrays **/
            int size = 50000 * i;
            double[] tmp = new double[size];
            for (int j = 0; j < tmp.length; j++) {
                tmp[j] = Double.parseDouble(df.format(r.nextDouble())) + r.nextInt(1000);
            }
            tests[i - 1] = tmp;
        }

        System.out.println("--> SELECTION SORT NEXT -->");

        for (int i = 0; i < 10; i++) { /** SelectionSort, initiliazes 10 arrays sizes 50000 - 500000 **/
            double[] tmp = new double[tests[i].length];
            for (int j = 0; j < tests[i].length; j++) {
                tmp[j] = tests[i][j];
            }

            System.out.println("SelectionSort: " + tmp.length + " Items");

            long start = System.currentTimeMillis();
            selection.sort(tmp);
            long end = (System.currentTimeMillis() - start); /** timer to get the ms run time **/

            System.out.println("Time: " + end + "ms");
            System.out.println("Sorted: " + selection.check(tmp)); /** checks if sorted or not **/

            System.out.println("\n");
        }

        System.out.println("--> BUBBLE SORT NEXT -->");

        for (int i = 0; i < 10; i++) { /** BubbleSort, initiliazes 10 arrays sizes 50000 - 500000 **/
            double[] tmp = new double[tests[i].length];
            for(int j = 0; j<tests[i].length; j++){
                tmp[j] = tests[i][j];
            }

            System.out.println("BubbleSort: " + tmp.length + " Items");

            long start = System.currentTimeMillis();
            bubble.sort(tmp);
            long end = (System.currentTimeMillis() - start); /** timer to get the ms run time **/

            System.out.println("Time: " + end + "ms");
            System.out.println("Sorted: " + bubble.check(tmp)); /** checks if sorted or not **/

            System.out.println("\n");
        }

        System.out.println("--> INSERTION SORT NEXT -->");

        for (int i = 0; i < 10; i++) { /** InsertionSort, initiliazes 10 arrays sizes 50000 - 500000 **/
        double[] tmp = new double[tests[i].length];
            for (int j = 0; j < tests[i].length; j++) {
                tmp[j] = tests[i][j];
            }

            System.out.println("InsertionSort: " + tmp.length + " Items");

            long start = System.currentTimeMillis();
            insertion.sort(tmp);
            long end = (System.currentTimeMillis() - start); /** timer to get the ms run time **/

            System.out.println("Time: " + end + "ms");
            System.out.println("Sorted: " + insertion.check(tmp)); /** checks if sorted or not **/

            System.out.println("\n");

        }

        System.out.println("--> MERGE SORT NEXT -->");

        for (int i = 0; i < 10; i++) { /** MergeSort, initiliazes 10 arrays sizes 50000 - 500000 **/
            double[] tmp = new double[tests[i].length];
            for (int j = 0; j < tests[i].length; j++) {
               tmp[j] = tests[i][j];
            }

            System.out.println("MergeSort: " + tmp.length + " Items");

            long start = System.currentTimeMillis();
            merge.mergeSort(tmp, 0, tmp.length - 1);
            long end = (System.currentTimeMillis() - start); /** timer to get the ms run time **/

            System.out.println("Time: " + end + "ms");
            System.out.println("Sorted: " + merge.check(tmp)); /** checks if sorted or not **/

            System.out.println("\n");

        }

        System.out.println("--> QUICK SORT NEXT -->");

        for (int i = 0; i < 10; i++) { /** QuickSort, initiliazes 10 arrays sizes 50000 - 500000 **/
            double[] tmp = new double[tests[i].length];
            for(int j = 0; j<tests[i].length; j++){
                tmp[j] = tests[i][j];
            }

            System.out.println("QuickSort: " + tmp.length + " Items");

            long start = System.currentTimeMillis();
            quick.sort(tmp);
            long end = (System.currentTimeMillis() - start); /** timer to get the ms run time **/

            System.out.println("Time: " + end + "ms");
            System.out.println("Sorted: " + quick.check(tmp)); /** checks if sorted or not **/

            System.out.println("\n");

        }

        System.out.println("--> HYBRID SORT NEXT -->");

        for (int i = 0; i < 10; i++) { /** HybridSort, initiliazes 10 arrays sizes 50000 - 500000 **/
            double[] tmp = new double[tests[i].length];
            for (int j = 0; j < tests[i].length; j++) {
                tmp[j] = tests[i][j];
            }

            System.out.println("HybridSort: " + tmp.length + " Items");

            long start = System.currentTimeMillis();
            hybrid.sort(tmp);
            long end = (System.currentTimeMillis() - start); /** timer to get the ms run time **/

            System.out.println("Time: " + end + " ms");
            System.out.println("Sorted: " + quick.check(tmp)); /** checks if sorted or not **/

            System.out.println("\n");
        }
    }
}
