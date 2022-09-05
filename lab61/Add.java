package lab61;

import java.io.IOException;

public class Add extends Thread{
    Collection obj;

    public Add(Collection obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            synchronized (obj){
                System.out.println("Добавляем объект:");
                obj.addNew();
                obj.print();
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
