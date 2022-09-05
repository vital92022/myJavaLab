import java.io.IOException;

public class Add extends Thread{
    Collect obj;

    public Add(Collect obj){
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
