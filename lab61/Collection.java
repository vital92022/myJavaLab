package lab61;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Collection<T> {
    private T[] coll = (T[]) new Object[2];
    static int i = 0;
    static int len = 2;

    public void add() throws IOException {
        if (i == coll.length) {
            Collection.len *= 2;
            coll = Arrays.copyOf(coll, len * 2);
        }
        System.out.println("Paper or Writing?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        T object;
        if (str.equals("Paper") || str.equals("paper") || str.equals("p") || str.equals("P")) {
            object = (T) new Paper();
        } else {
            object = (T) new Writing();
        }
        coll[i++] = object;
        CollectionWriting.addWriting(object);
    }

    public void set(int i) throws IOException {
        System.out.println("Paper or Writing?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        if (str.equals("Paper") || str.equals("paper") || str.equals("p") || str.equals("P")) {
            T object = (T) new Paper();
            coll[i - 1] = object;
        } else {
            T object = (T) new Writing();
            coll[i - 1] = object;
        }
    }

    public void remove(int j) {
        for (; j < i - 1; j++) {
            coll[j] = coll[j + 1];
        }
        i--;
    }

    public int getlenght() {
        return i;
    }

    public void print() {
        for (int j = 0; j < i; j++) {
            System.out.println(coll[j]);
        }
    }

    public void save() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название файла: ");
        String file = br.readLine();
        String s = file + ".txt";
        try (FileWriter writer = new FileWriter(s)) {
            for (int j = 0; j < i; j++) {
                Object obj = coll[j];
                if (obj != null) {
                    writer.write(obj.toString());
                    writer.write("\n");
                } else
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Успешно записано!");
    }

    public void load() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название файла: ");
        String file = br.readLine();
        String s = file + ".txt";
        try (Scanner sc = new Scanner(new FileReader(s))) {
            int n = Integer.parseInt(sc.next());
            for (int i = 0; i < n; i++) {
                this.add(sc);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void add(Scanner sc) throws IOException {
        if (i == coll.length) {
            Collection.len *= 2;
            coll = Arrays.copyOf(coll, len * 2);
        }
        String str = sc.next();
        T object;
        if (str.equals("Paper") || str.equals("paper") || str.equals("p") || str.equals("P")) {
            object = (T) new Paper(sc);
        } else {
            object = (T) new Writing(sc);
        }
        coll[i++] = object;
        CollectionWriting.addWriting(object);
    }

    public void averageCost() {
        double totalCost = 0;
        for (int j = 0; j < i; j++) {
            totalCost += ((Stationery) coll[j]).getCost();
        }
        double averageCost = totalCost / i;
        System.out.println("Средняя стоимость товара: " + averageCost);
    }

    public void maxCost() {
        double maxCost = 0;
        int index = 0;
        for (int j = 0; j < i; j++) {
            double cost = ((Stationery) coll[j]).getCost();
            if (maxCost < cost) {
                maxCost = cost;
                index = j;
            }
        }
        System.out.println("Самая дорогая покупка: " + coll[index]);
    }

    public void removeNew() {
        Random rand = new Random();
        int j = rand.nextInt(10);
        if(j <= i - 1){
            for (; j < i - 1; j++) {
                coll[j] = coll[j + 1];
            }
            i--;
            System.out.println("Объект удален.");
        }
        else{
            System.out.println("Объект не удален.");
        }
    }

    public void addNew() throws IOException {
        if (i == coll.length) {
            Collection.len *= 2;
            coll = Arrays.copyOf(coll, len * 2);
        }
        coll[i++]= (T) new Paper("Объект " + i, i*10, "A4");
    }

    public void setNew() throws IOException {
        Random rand = new Random();
        int j = rand.nextInt(10);
        if(j <= i - 1){
            System.out.println("Oбьект был таким");
            System.out.println(coll[j].toString());
            T object = (T) new Writing("NewObject",322,"black");
            coll[j] = object;
            System.out.println("Объект изменен.");
            System.out.println(coll[j].toString());
        }
        else{
            System.out.println("Объект не изменен.");
        }
    }
}
