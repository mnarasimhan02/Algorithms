/*
THE COMPLEXITY OF INSERTION SORT IS O(N2)
IT TAKES O(1) EXTRA SPACE, IT SORTS IN PLACE
THIS SORT FIRST ASSUMES A SORTED LIST OF SIZE 1 AND INSERTS ADDITIONAL ELEMENTS IN THE RIGHT POSITION
IT MAKES O(N2) COMPARISONS AND O(N2) SWAPS
In insertion sort elements are bubbled into the sorted section, while in bubble sort the maximums are bubbled out of the unsorted section.
I think the main thing I needed highlighted is that the break statement in Insertion Sort means that it can terminate each iteration early: ie when it has found its position in the sorted section. 
Bubble sort requires that the swapping continues until the largest element in the unsorted section reaches the sorted section, so will never terminate early.
 */
public class InsertionSort {

    private static int listToSort[] = new int[] {3, 5, 6, 8, 10, 1, 2, 4, 7, 9};

    public static void main(String[] args) {
        print(listToSort);
        insertionSort(listToSort);
    }

    public static void print(int[] listToSort) {
        for (int el : listToSort) {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }

    public static void insertionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (listToSort[j] < listToSort[j - 1]) {
                    swap(listToSort, j, j - 1);
                } else {
                    break;
                }
                print(listToSort);
            }
        }
    }
}
