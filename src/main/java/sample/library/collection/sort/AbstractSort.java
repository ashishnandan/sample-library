package sample.library.collection.sort;

public abstract class AbstractSort<T extends Comparable<T>> {
    protected T[] elements;

    public AbstractSort(T[] elements) {
        this.elements = elements;
    }

    protected AbstractSort() {
    }

    public void swap(int idx1, int idx2) {
        T temp = elements[idx1];
        elements[idx1] = elements[idx2];
        elements[idx2] = temp;
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

    public abstract void sort();
}
