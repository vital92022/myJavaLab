package Lab62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collect<T> {

    private T[] collection = (T[]) new Object[2];
    private static int LENGTH = 0;
    private static int startLength = 2;


    public void resize() {
        collection = Arrays.copyOf(collection, LENGTH * 2);
    }

    public void add(T a) {
        if (LENGTH == collection.length)
            resize();
        collection[LENGTH++] = a;
    }

    public void set(int i, T a) {
        collection[i] = a;
    }

    public void remove(int j) {
        for (; j < LENGTH - 1; j++) {
            collection[j] = collection[j + 1];
        }
        LENGTH--;
    }


    public T getObj(int i) {
        return collection[i];
    }

    public int lenght () {
        return LENGTH;
    }

    public void print() {
        for (int j = 0; j < LENGTH; j++) {
            System.out.println(collection[j]);
        }
    }

    public double cost() {
        double price = 0;
        for (T i : collection) {
            price += ((Furniture) i).getPrice();
        }
        return price;
    }

    public T findSpecialTitle(String s) {
        for (T i : collection) {
            String tittle = ((Furniture) i).getFurniture();
            if (s.equals(tittle))
                return i;
        }
        return null;
    }
}
