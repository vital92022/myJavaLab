package Lab63;

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
                        "\n5.Общая стоимость мебели" +
                        "\n6.Вывести мебель по названию" +
                        "\n7.Сохранить мебель для вывода на экран в файл" +
                        "\n8.Загрузить мебель для вывода на экран из файла" +
                        "\n9.Выход" +
                        "\n\nВыберите действие"
        );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short n = Short.parseShort(br.readLine());
        Controller a = new Controller();
        //Collect<ComputerEquipment1> col = new Collect<>();

        switch (n) {
            case 1:
                a.addObj();
                break;
            case 2:
                if (Collect.getLenght()!=0) {
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
                if (Collect.getLenght()!=0) {
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
            case  5:
                a.allCost();
                break;
            case 6:
                a.findTitle();
                break;
            case 7:
                a.saveFile();
                break;
            case 8:
                a.loadFile();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Введен неверный символ");
        }
        menu();
    }

}