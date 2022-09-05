public class Print extends Thread{
    Collect obj;

    public Print(Collect obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.print();
    }
}

