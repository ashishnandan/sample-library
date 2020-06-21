package sample.library.collection.sort;

import java.util.Random;

public class ShellSort<T extends Comparable<T>> extends AbstractSort<T> {
    public ShellSort(T[] elements) {
        super(elements);
    }

    public void sort() {
        int increment = elements.length / 2;
        while (increment >= 1) {
            for (int i = 0; i < increment; i++) {
                insertionSort(i, increment);
            }
            increment = increment / 2;
        }
    }

    public void insertionSort(int start, int increment) {
        for (int j = start; j + increment < elements.length; j = j + increment) {
            if (elements[j].compareTo(elements[j + increment]) > 0) {
                swap(j, j + increment);
                for (int k = j; j - increment >= 0; j = j - increment) {
                    if (elements[j - increment].compareTo(elements[j]) > 0) {
                        swap(j - increment, j);
                    } else break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[50];
        for (int i = 0; i < 50; i++)
            arr[i] = new Random().nextInt(1000);
        AbstractSort<Integer> shellSort = new ShellSort<>(arr);
        System.out.println("Arr : " + shellSort.display());
        shellSort.sort();
        System.out.println("Sorted Arr : " + shellSort.display());

    }
}
