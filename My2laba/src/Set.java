import java.io.IOException;

public class Set extends Thread {
    Collect obj;

    public Set(Collect obj) {
        this.obj = obj;
    }

    @Override
    public void run() {

        try {
            synchronized (obj) {
                System.out.println("Изменение объекта.");
                obj.setNew();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
