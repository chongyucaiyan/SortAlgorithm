package com.github.cyc.sortalgorithm;

/**
 * Created by cyc on 18/12/26.
 */
public class HeapSort {

    private HeapSort() {

    }

    public static void sort1(int[] array) {
        toHeap1(array);

        for (int i = array.length - 1; i > 0; i--) {
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;
            heapDown1(array, i, 0);
        }
    }

    private static void toHeap1(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapDown1(array, array.length, i);
        }
    }

    private static void heapDown1(int[] array, int length, int i) {
        for (int j = 2 * i + 1; j < length; i = j, j = 2 * i + 1) {
            if (j + 1 < length && array[j + 1] > array[j]) {
                j++;
            }

            if (array[i] >= array[j]) {
                break;
            }

            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public static void sort2(int[] array) {
        toHeap2(array);

        for (int i = array.length - 1; i > 0; i--) {
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;
            heapDown2(array, i, 0);
        }
    }

    private static void toHeap2(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapDown2(array, array.length, i);
        }
    }

    private static void heapDown2(int[] array, int length, int i) {
        int tmp = array[i];
        for (int j = 2 * i + 1; j < length; i = j, j = 2 * i + 1) {
            if (j + 1 < length && array[j + 1] > array[j]) {
                j++;
            }

            if (tmp >= array[j]) {
                break;
            }

            array[i] = array[j];
        }
        array[i] = tmp;
    }
}
