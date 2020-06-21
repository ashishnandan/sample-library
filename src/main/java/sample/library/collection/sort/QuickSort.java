package sample.library.collection.sort;

import java.util.Random;

public class QuickSort<T extends Comparable<T>> extends AbstractSort<T> {
    private final T[] elements;

    public QuickSort(T[] elements) {
        this.elements = elements;
    }

    public void sort() {
        quickSort(elements, 0, elements.length - 1);
    }

    public void swap(T[] listToSort, int idx1, int idx2) {
        T temp = listToSort[idx1];
        listToSort[idx1] = listToSort[idx2];
        listToSort[idx2] = temp;
    }

    public String display() {
        StringBuilder view = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            T a = elements[i];
            view.append(a);
            if (i == elements.length - 1) break;
            view.append(", ");
        }

        return view.toString();
    }

    private void quickSort(T arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(T arr[], int begin, int end) {
        T pivot = arr[begin];
        int curr = begin;
        int swappedIdx = 0;
        for (int i = begin; i <= end; i++) {
            if (i == curr) continue;
            if (arr[i].compareTo(pivot) < 0) {
                swap(arr, i, curr);
                curr++;
                if (arr[i] == pivot) swappedIdx = i;
            }
        }
        if (arr[curr] != pivot) swap(arr, curr, swappedIdx);
        return curr;
    }


    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++)
            arr[i] = new Random().nextInt(1000);
        QuickSort<Integer> quickSort = new QuickSort<>(arr);
        System.out.println("Initial Arr : " + quickSort.display());
        quickSort.sort();
        System.out.println("Sorted Arr : " + quickSort.display());

    }
}
