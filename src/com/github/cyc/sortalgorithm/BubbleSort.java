package com.github.cyc.sortalgorithm;

/**
 * Created by cyc on 18/12/26.
 */
public class BubbleSort {

    private BubbleSort() {

    }

    public static void sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j + 1 < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void sort2(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j + 1 < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
