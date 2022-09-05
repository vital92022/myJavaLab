public class Remove extends Thread{
    Collect obj;

    public Remove(Collect obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            System.out.println("\nУдаляем объект.");
            obj.removeNew();
            System.out.println();
        }
    }
}