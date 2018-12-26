package com.github.cyc.sortalgorithm;

/**
 * Created by cyc on 18/12/26.
 */
public class SelectionSort {

    private SelectionSort() {

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }
}
