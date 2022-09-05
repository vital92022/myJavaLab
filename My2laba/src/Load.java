import java.io.IOException;

public class Load extends Thread {
    Collect obj;

    public Load(Collect obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            obj.load();
            obj.print();
        }

    }
}
