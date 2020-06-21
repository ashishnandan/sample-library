package sample.library.collection.sort;

import java.util.Random;

public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T>{

    public SelectionSort(T[] elements) {
        super(elements);
    }

    public void sort(){
        for (int i = 0; i < elements.length; i++){
            for (int j = i; j < elements.length - 1; j++){
                if (elements[i].compareTo(elements[j+1]) > 0){
                    swap(i, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i=0; i < 20; i++)
            arr[i] = new Random().nextInt(1000);
        SelectionSort<Integer> selectionSort = new SelectionSort<>(arr);
        System.out.println("Arr : " + selectionSort.display());
        selectionSort.sort();
        System.out.println("Sorted Arr : " + selectionSort.display());

    }
}
