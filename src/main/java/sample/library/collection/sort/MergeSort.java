package sample.library.collection.sort;

import java.util.Random;

public class MergeSort<T extends Comparable<T>> extends AbstractSort<T> {

    public MergeSort(T[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        mergeSort(elements, 0, elements.length - 1);
    }

    public void mergeSort(T[] listToSort, int begin, int end) {

        int pivot = (begin + end) / 2;
        if (begin < end) {
            mergeSort(listToSort, begin, pivot);
            mergeSort(listToSort, pivot + 1, end);
            merge(listToSort, begin, end);
        }
    }

    public void merge(T[] listToSort, int begin, int end) {

        for (int i = begin; i < end; i++) {
            if (listToSort[i].compareTo(listToSort[i + 1]) > 0) {
                swap(i, i + 1);
                for (int j = i; j > 0; j--) {
                    if (listToSort[j].compareTo(listToSort[j - 1]) < 0) swap(j, j - 1);
                }
            }
        }
    }

    @Override
    public String display() {
        StringBuilder builder = new StringBuilder();
        for (T el : elements) {
            builder.append(el).append(", ");
        }
        return builder.substring(0, builder.length() - 2);
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < 20; i++)
            arr[i] = new Random().nextInt(1000);
        MergeSort<Integer> mergeSort = new MergeSort<>(arr);
        System.out.println("Arr : " + mergeSort.display());
        mergeSort.sort();
        System.out.println("Sorted Arr : " + mergeSort.display());
    }
}
