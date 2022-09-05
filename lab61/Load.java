package lab61;

import java.io.IOException;

public class Load  extends Thread{
    Collection obj;

    public Load(Collection obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            obj.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
