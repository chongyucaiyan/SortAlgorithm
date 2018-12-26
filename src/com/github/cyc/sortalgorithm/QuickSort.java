package com.github.cyc.sortalgorithm;

/**
 * Created by cyc on 18/12/26.
 */
public class QuickSort {

    private QuickSort() {

    }

    public static void sort(int[] array, int first, int last) {
        if (first >= last) {
            return;
        }

        int i = first, j = last;

        int tmp = array[i];
        while (i < j) {
            while (i < j && array[j] >= tmp) {
                j--;
            }
            if (i < j) {
                array[i++] = array[j];
            }

            while (i < j && array[i] <= tmp) {
                i++;
            }
            if (i < j) {
                array[j--] = array[i];
            }
        }
        array[i] = tmp;

        sort(array, first, i - 1);
        sort(array, i + 1, last);
    }
}
