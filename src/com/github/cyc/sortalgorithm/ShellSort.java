package com.github.cyc.sortalgorithm;

/**
 * Created by cyc on 18/12/26.
 */
public class ShellSort {

    private ShellSort() {

    }

    public static void sort1(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {
                    int tmp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = tmp;
                }
            }
        }
    }

    public static void sort2(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                if (array[i] < array[i - gap]) {
                    int tmp = array[i];
                    int j = i - gap;
                    for (; j >= 0 && array[j] > tmp; j -= gap) {
                        array[j + gap] = array[j];
                    }
                    array[j + gap] = tmp;
                }
            }
        }
    }
}
