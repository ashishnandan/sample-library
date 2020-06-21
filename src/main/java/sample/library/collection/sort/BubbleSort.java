package sample.library.collection.sort;

import java.util.Random;

public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T>{

    public BubbleSort(T[] elements) {
        super(elements);
    }

    public void sort(){
        for (int i = elements.length - 1; i > 0; i--){
            boolean swapped = false;
            for (int j = 0; j < i; j++){
                if (elements[j].compareTo(elements[j + 1]) > 0) {
                    swap(j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i=0; i < 20; i++)
            arr[i] = new Random().nextInt(1000);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>(arr);
        System.out.println("Arr : " + bubbleSort.display());
        bubbleSort.sort();
        System.out.println("Sorted Arr : " + bubbleSort.display());

    }
}
