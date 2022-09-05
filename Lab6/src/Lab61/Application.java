package Lab61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Application {
    public void startApp() throws IOException {
        menu();
    }

    private void menu() throws IOException {
        System.out.println(
                        "\n1.Добавить элемент в коллекцию" +
                        "\n2.Обновить элемент в коллекции " +
                        "\n3.Удалить элемент коллекции по номеру" +
                        "\n4.Вывести эл на экран" +
                        "\n5.Выход" +
                        "\n\nВыберите действие"
        );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short n = Short.parseShort(br.readLine());
        Controller a = new Controller();
        Collect col = new Collect();

        switch (n) {
            case 1:
                a.addObj();
                break;
            case 2:
                if (col.lenght()!=0) {
                    System.out.println("Введите какой элемент меняем");
                    int t = Integer.parseInt(br.readLine());
                    a.setObj(t);
                    break;
                }
                else {
                    System.out.println("Сначала заполните коллекцию");
                    break;
                }
            case 3:
                if (col.lenght()!=0) {
                    System.out.println("Введите какой элемент удаляем");
                    int t1 = Integer.parseInt(br.readLine());
                    a.remove(t1);
                    break;
                }
                else {
                    System.out.println("Сначала заполните коллекцию");
                    break;
                }
            case 4:
                a.printAll();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Введен неверный символ");
        }
        menu();
    }

}
