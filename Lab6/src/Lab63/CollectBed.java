package Lab63;

import java.io.*;
import java.util.Arrays;

public class CollectBed extends Collect<Bed> {

    private static Bed[] collect = new Bed[10];
    private static int LENGTH = 0;

    public static Boolean checked(Object obj) {
        return obj instanceof Bed;
    }

    public static void addBed(Object obj) {
        if (checked(obj)) {
            if (LENGTH == collect.length)
                resizeBed();
            collect[LENGTH++] = (Bed) obj;
            System.out.println("Добавили");
            System.out.println(collect.toString());
        }
    }
    public static void resizeBed() {
        collect = Arrays.copyOf(collect, LENGTH * 2);
    }

    public static void save(String nameFile) throws IOException {
        String s = nameFile + ".txt";
        try (FileWriter writer = new FileWriter(s)) {
            for (Bed i : collect) {
                if (i != null) {
                    writer.write(i.toString());
                    writer.write("\n");
                } else
                    break;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Успешно записано!");
    }

    public static void load(String nameFile) throws IOException {
        String s = nameFile + ".txt";
        try (FileReader reader = new FileReader(s)) {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
