package lab61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remove extends Thread{
    Collection obj;

    public Remove(Collection obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            System.out.println("\nУдаляем объект.");
            obj.removeNew();
            System.out.println();
        }
    }
}
