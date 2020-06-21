package sample.library.collection.search;

import sample.library.collection.sort.QuickSort;

import java.util.Random;

public class BinarySearch<T extends Comparable<T>> {

    private T[] elements;

    public BinarySearch(T[] elements) {
        this.elements = elements;
        new QuickSort<T>(elements).sort();
    }

    public int search(T elem) {
        return searchElem(elem, 0, elements.length);
    }

    public int searchElem(T elem, int begin, int end) {

        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (elements[mid].compareTo(elem) == 0) return mid;
            if (elements[mid].compareTo(elem) > 0) end = mid - 1;
            else begin = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++)
            arr[i] = new Random().nextInt(1000);
        BinarySearch<Integer> binarySearch = new BinarySearch<>(arr);
        System.out.println(binarySearch.search(555));
    }
}
