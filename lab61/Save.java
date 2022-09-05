package lab61;

import java.io.IOException;

public class Save extends Thread{
    Collection obj;

    public Save(Collection obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            obj.save();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
