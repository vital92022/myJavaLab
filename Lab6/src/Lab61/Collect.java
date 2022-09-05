package Lab61;

import java.util.Arrays;

public class Collect {

    private static  Furniture [] collection = new Furniture[2];

    static int i = 0;

    public int lenght () {
        return i;
    }

    public  void add(Furniture a) {
        if (collection.length == i) {
//            collection =Arrays.copyOf(collection,i*2);
            Furniture[] collection1 = new Furniture[i*2];
            for (int j = 0; j <i ; j++) {
                collection1[j]=collection[j];

            }
            collection=collection1;
        }
        collection[i++] = a;
    }

    public void set(int i, Furniture a) {
        collection[i] = a;
    }

    public void remove(int j) {
        for (; j<i-1; j++) {
            collection[j] = collection[j+1];
        }
        i--;
    }

    public void print() {
        for (int j =0; j<i; j++) {
            System.out.println(collection[j]);
        }
    }
}
