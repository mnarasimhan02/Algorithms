/**
 * THE COMPLEXITY OF BUBBLE SORT IS O(N2)
 * IT TAKES O(1) EXTRA SPACE, IT SORTS IN PLACE
 * IT IS A STABLE SORT - ENTITIES WHICH ARE EQUAL WILL NOT BE RE-ARRANGED
 * IT MAKES O(N2) COMPARISONS AND O(N2) SWAPS
 * In insertion sort elements are bubbled into the sorted section, while in bubble sort the maximums are bubbled out of the unsorted section.
 */
public class BubbleSort {

    private static int listToSort[] = new int[] {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};

    public static void main(String[] args) {
        print(listToSort);
        bubbleSort(listToSort);
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

    public static void bubbleSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
        		boolean swapped=false;
            for (int j = listToSort.length-1; j > i; j--) {
            	System.out.print(j);
                if (listToSort[j] < listToSort[j-1]) {
                    swap(listToSort, j, j-1);
                    swapped=true;
                }
            }
            print(listToSort);
            if (!swapped) {
            	break;
            }
        }
    }
}