package lab61;

import java.io.*;
import java.util.Arrays;

public class CollectionWriting extends Collection<Writing> {
    private static Writing[] collect = new Writing[10];
    private static int len = 0;

    public static Boolean checked(Object obj) {
        return obj instanceof Writing;
    }

    public static void addWriting(Object obj) {
        if (checked(obj)) {
            if (len == collect.length) {
                collect = Arrays.copyOf(collect, len * 2);
            }
            collect[len++] = (Writing) obj;
        }
    }

    /*public static void save() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название файла: ");
        String file = br.readLine();
        String s = file + ".txt";
        try (FileWriter writer = new FileWriter(s)) {
            for (Writing i : collect) {
                if (i != null) {
                    writer.write(i.toString());
                    writer.write("\n");
                } else
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Успешно записано!");
    }*/

    /*public static void load() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название файла: ");
        String file = br.readLine();
        String s = file + ".txt";
        try (FileReader reader = new FileReader(s)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/
}
