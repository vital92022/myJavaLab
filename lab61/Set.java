package lab61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Set extends Thread{
    Collection obj;

    public Set(Collection obj){
        this.obj = obj;
    }

    @Override
    public void run() {

        try {
            synchronized (obj){
                System.out.println("Изменение объекта.");
                obj.setNew();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
