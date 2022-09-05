import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Collect<T> {

    private T[] collection = (T[]) new Object[2];
    private static int LENGTH = 0;
    private static int startLength = 2;

    static int i = 0;


    public void resize() {
        collection = Arrays.copyOf(collection, LENGTH * 2);
    }

    public void add(T a) {
        if (LENGTH == collection.length)
            resize();
        collection[LENGTH++] = a;
    }

    public void set(int i, T a) {
        collection[i] = a;
    }

    public void remove(int j) {
        for (; j < LENGTH - 1; j++) {
            collection[j] = collection[j + 1];
        }
        LENGTH--;
    }


    public T getObj(int i) {
        return collection[i];
    }

    public int lenght () {
        return LENGTH;
    }

    public void print() {
        for (int j = 0; j < LENGTH; j++) {
            System.out.println(collection[j]);
        }
    }

    public double cost() {
        double price = 0;
        for (T i : collection) {
            price += ((Furniture) i).getPrice();
        }
        return price;
    }

    public T findSpecialTitle(String s) {
        for (T i : collection) {
            String tittle = ((Furniture) i).getFurniture();
            if (s.equals(tittle))
                return i;
        }
        return null;
    }

    public void removeNew() {
        Random rand = new Random();
        int j = rand.nextInt(10);
        if (j <= i - 1) {
            for (; j < i - 1; j++) {
                collection[j] = collection[j + 1];
            }
            i--;
            System.out.println("Объект удален.");
        } else {
            System.out.println("Объект не удален.");
        }
    }

    public void addNew() throws IOException {
        if (i == collection.length) {
            Collect.startLength *= 2;
            collection = Arrays.copyOf(collection, startLength * 2);
        }
        collection[i++] = (T) new Bed("Объект" + i, i * 10, Size.SINGLE);
        System.out.println(collection[i - 1]);
    }

    public void setNew() throws IOException {
        Random rand = new Random();
        int j = rand.nextInt(10);
        if (j <= i - 1) {
            System.out.println("Oбьект был таким");
            System.out.println(collection[j].toString());
            T object = (T) new Chair("Chair", 322, 2.5);
            collection[j] = object;
            System.out.println("Объект изменен.");
            System.out.println(collection[j].toString());
        } else {
            System.out.println("Объект не изменен.");
        }
    }

    public void save() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введите название файла куда записать : ");
        System.out.println("Данные записаны в write.txt");
        //String file = br.readLine();
        //String s = "src/" + file + ".txt";
        String s = "src/write.txt";
        try (FileWriter writer = new FileWriter(s)) {
            for (int j = 0; j < i; j++) {
                Object obj = collection[j];
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

    public void load() {
        //System.out.println("Введите название файла откуда взять данные : ");
        System.out.println("Данные получены из read.txt");
        Scanner scanner = new Scanner(System.in);
        //String string = scanner.nextLine();
        //String nameFile = "src/" + string + ".txt";
        String nameFile = "src/read.txt";
        try (Scanner scanner1 = new Scanner(new FileReader(nameFile))) {
            while (scanner1.hasNextLine()) {
                String volue = scanner1.nextLine();
                String[] field = volue.split(" ");
                try {
                    switch (field.length) {
                        case 2: {
                            Furniture furniture = new Furniture(field[0], Double.parseDouble(field[1]));
                            System.out.println(furniture);
                            break;
                        }
                        case 4: {
                            Bed bed = new Bed(field[0], Double.parseDouble(field[1]),
                                    Double.parseDouble(field[2]));
                            System.out.println(bed);
                            break;
                        }
                        case 3: {
                            Chair chair = new Chair(field[0], Double.parseDouble(field[1]),
                                    Double.parseDouble(field[2]));
                            System.out.println(chair);
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
