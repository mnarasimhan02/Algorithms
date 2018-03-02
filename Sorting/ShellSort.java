/*
THE COMPLEXITY OF SHELL SORT IS SOMEWHERE BETWEEN O(N) AND O(N2)
IT TAKES O(1) EXTRA SPACE, IT SORTS IN PLACE. THE ALGORITHM IS ADAPTIVE SINCE ITS BASED ON INSERTION SORT WHICH IS ADAPTIVE
GETTING THE EXACT COMPLEXITY OF SHELL SORT IS HARD BECAUSE IT DEPENDS ON THE INCREMENT VALUES CHOSEN
THE COMPLEXITY OF SHELL SORT IS BETTER THAN INSERTION SORT AS THE FINAL ITERATION WITH INCREMENT = 1 HAS TO WORK WITH A NEARLY SORTED LIST
ALL ITERATIONS THROUGH THE LIST ARE BASED ON THE INCREMENT. ADJACENT ELEMENTS SEPARATED BY AN INCREMENT ARE COMPARED
INSERTION SORT TAKES IN A START INDEX AND AN INCREMENT. THE SORT IS COMPLETE WHEN INCREMENT REACHES 1
CALL INSERTION SORT ON ALL THE SUB-LISTS CREATED BY ELEMENTS “INCREMENT” APART
 */
public class ShellSort {

    private static int listToSort[] = new int[]{3, 5, 6, 8, 10, 1, 2, 4, 7, 9};

    public static void main(String[] args) {
        print(listToSort);
        shellSort(listToSort);
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

    public static void insertionSort(int[] listToSort, int startIndex, int increment) {
        for (int i = startIndex; i < listToSort.length; i = i + increment) {
            for (int j = Math.min(i + increment, listToSort.length - 1);
                 j - increment >= 0;
                 j = j - increment) {
                if (listToSort[j] < listToSort[j - increment]) {
                    swap(listToSort, j, j - increment);
                } else {
                    break;
                }
                print(listToSort);
            }
        }
    }

    public static void shellSort(int[] listToSort) {
        int increment = listToSort.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(listToSort, startIndex, increment);
            }

            increment = increment / 2;
        }
    }
}