import java.io.IOException;

public class Save extends Thread {
    Collect obj;

    public Save(Collect obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            synchronized (obj) {
                obj.save();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}