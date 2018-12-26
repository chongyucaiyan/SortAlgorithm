package com.github.cyc.sortalgorithm;

/**
 * Created by cyc on 18/12/26.
 */
public class InsertionSort {

    private InsertionSort() {

    }

    public static void sort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j--) {
                int tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
            }
        }
    }

    public static void sort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int tmp = array[i];
                int j = i - 1;
                for (; j >= 0 && array[j] > tmp; j--) {
                    array[j + 1] = array[j];
                }
                array[j + 1] = tmp;
            }
        }
    }
}
