package sample.library.collection.sort;

import java.util.Random;

public class InsertionSort<T extends Comparable<T>> extends AbstractSort<T> {

    public InsertionSort(T[] elements) {
        super(elements);
    }

    public void sort() {
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i].compareTo(elements[i + 1]) > 0) {
                swap(i, i + 1);
                for (int j = i; j > 0; j--) {
                    if (elements[j - 1].compareTo(elements[j]) > 0) swap(j - 1, j);
                    else break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i=0; i < 20; i++)
            arr[i] = new Random().nextInt(1000);
        InsertionSort<Integer> insertionSort = new InsertionSort<>(arr);
        System.out.println("Arr : " + insertionSort.display());
        insertionSort.sort();
        System.out.println("Sorted Arr : " + insertionSort.display());

    }
}
