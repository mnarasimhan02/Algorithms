/**
 * THE COMPLEXITY OF SELECTION SORT IS O(N2)
 * IT TAKES O(1) EXTRA SPACE, IT SORTS IN PLACE
 * IT IS NOT A STABLE SORT - ENTITIES WHICH ARE EQUAL MIGHT BE RE-ARRANGED
 * IT MAKES O(N2) COMPARISONS AND O(N) SWAPS
 */
public class SelectionSort {

    private static int listToSort[] = new int[] {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};

    public static void main(String[] args) {
        print(listToSort);
        selectionSort(listToSort);
    }

    public static void print(int[] listToSort) {
        for (int i=0; i<listToSort.length;++i) {
            System.out.print(listToSort[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }

    public static void selectionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            for (int j = i + 1; j < listToSort.length; j++) {
                if (listToSort[i] > listToSort[j]) {
                    swap(listToSort, i, j);
                }
            }
            print(listToSort);
        }
    }
}