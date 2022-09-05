import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Collect<Furniture> collection = new Collect<>();

    public static void main(String[] args) throws IOException {
//        Application application = new Application();
//        application.startApp();
        Add a;
        Set s;
        Remove r;
        Save b;
        Load load;
        load = new Load(collection);
        load.start();
        for (int i = 0; i < 3; i++) {
            a = new Add(collection);
            r= new Remove(collection);
            s = new Set(collection);
            b = new Save(collection);
            a.start();
            r.start();
            b.start();
            s.start();
        }

    }
}