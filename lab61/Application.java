package lab61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public synchronized void start() throws IOException, InterruptedException {
        menu();
    }

    private static Collection<Stationery> collection = new Collection<>();

    private synchronized void menu() throws IOException, InterruptedException {
        /*System.out.println("\n1 - Добаввить элемент");
        System.out.println("2 - Обновить элемент");
        System.out.println("3 - Удалить элемент");
        System.out.println("4 - Вывести все элементы");
        System.out.println("5 - Средняя стоимость товаров");
        System.out.println("6 - Самая дорогая покупка");
        System.out.println("7 - Сохранить в файл");
        System.out.println("8 - Загрузить из файла");
        System.out.println("0 - Выход");
        System.out.println("Выберите действие");*/

        Add a = new Add(collection);
        for (int i = 0; i < 10; i++) {
            if (a.isAlive())
                a.interrupt();
            else
                a.start();
            a.join();
        }

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Add a = new Add(collection);
        Set s = new Set(collection);
        Remove r = new Remove(collection);
        for (int i = 0; i < 10; i++) {
            a.start();
            s.start();
            r.start();
        }
        /*Load l = new Load(collection);
        Print p = new Print(collection);
        Save save = new Save(collection);
        switch (n) {
            case 1:
                a.start();
                a.join();
                break;
            case 2:
                if (collection.getlenght() != 0) {
                    s.start();
                    s.join();
                    break;
                } else {
                    System.out.println("Коллекция пуста");
                    break;
                }
            case 3:
                if (collection.getlenght() != 0) {
                    r.start();
                    r.join();
                    break;
                } else {
                    System.out.println("Коллекция пуста");
                    break;
                }
            case 4:
                p.start();
                p.join();
                break;
            case 5:
                collection.averageCost();
                break;
            case 6:
                collection.maxCost();
                break;
            case 7:
                save.start();
                save.join();
                break;
            case 8:
                l.start();
                l.join();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Введен неверный символ");
        }
        menu();*/
    }
}
