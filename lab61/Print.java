package lab61;

public class Print extends Thread{
    Collection obj;

    public Print(Collection obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.print();
    }
}
