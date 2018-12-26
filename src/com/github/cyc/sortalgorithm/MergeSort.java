package com.github.cyc.sortalgorithm;

/**
 * Created by cyc on 18/12/26.
 */
public class MergeSort {

    private MergeSort() {

    }

    public static void sort1(int[] array, int first, int last) {
        if (first >= last) {
            return;
        }

        int middle = (first + last) / 2;
        sort1(array, first, middle);
        sort1(array, middle + 1, last);
        mergeArray1(array, first, middle, last);
    }

    private static void mergeArray1(int[] array, int first, int middle, int last) {
        int[] buffer = new int[last - first + 1];
        int i = first, j = middle + 1, k = 0;

        while (i <= middle && j <= last) {
            if (array[i] < array[j]) {
                buffer[k++] = array[i++];
            } else {
                buffer[k++] = array[j++];
            }
        }

        while (i <= middle) {
            buffer[k++] = array[i++];
        }

        while (j <= last) {
            buffer[k++] = array[j++];
        }

        for (i = 0; i < k; i++) {
            array[first + i] = buffer[i];
        }
    }

    public static void sort2(int[] array) {
        mergeSort2(array, 0, array.length - 1, new int[array.length]);
    }

    private static void mergeSort2(int[] array, int first, int last, int[] buffer) {
        if (first >= last) {
            return;
        }

        int middle = (first + last) / 2;
        mergeSort2(array, first, middle, buffer);
        mergeSort2(array, middle + 1, last, buffer);
        mergeArray2(array, first, middle, last, buffer);
    }

    private static void mergeArray2(int[] array, int first, int middle, int last, int[] buffer) {
        int i = first, j = middle + 1, k = 0;

        while (i <= middle && j <= last) {
            if (array[i] < array[j]) {
                buffer[k++] = array[i++];
            } else {
                buffer[k++] = array[j++];
            }
        }

        while (i <= middle) {
            buffer[k++] = array[i++];
        }

        while (j <= last) {
            buffer[k++] = array[j++];
        }

        for (i = 0; i < k; i++) {
            array[first + i] = buffer[i];
        }
    }
}
