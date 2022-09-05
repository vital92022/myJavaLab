import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    private static Collect<Furniture> collection = new Collect<>();

    public void addObj() throws IOException {
        System.out.println("Что добавляем?\n" +
                "1.Кровать\n" +
                "2.Кресло");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short n = Short.parseShort(br.readLine());
        switch (n) {
            case 1:
                Furniture bed = new Bed();
                collection.add(bed);
                break;
            case 2:
                Furniture chair = new Chair();
                collection.add(chair);
                break;
        }
    }

    public void setObj(int i) throws IOException {
        System.out.println("Что добавляем?\n" +
                "1.Кровать\n" +
                "2.Кресло");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short n = Short.parseShort(br.readLine());
        switch (n) {
            case 1:
                Furniture bed = new Bed();
                collection.set(i - 1, (bed));
                break;
            case 2:
                Furniture chair = new Chair();
                collection.set(i - 1, (chair));
                break;
        }
    }

    public void remove(int i) {
        collection.remove(i - 1);
        System.out.println("Объект успешно удален");
    }

    public void printAll() {
        collection.print();
    }

    public void allCost() {
        System.out.println("Общая стоимость имеющейся мебели: " + collection.cost() + "$");
    }

    public void findTitle() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название искомой мебели: ");
        String title = br.readLine();

        Furniture a = collection.findSpecialTitle(title);
        if (a == null) {
            System.out.println("Такой мебели не существует");
        }
        for (int i = 0; i <collection.lenght()-1 ; i++) {
            if (a==collection.findSpecialTitle(title)) {
                System.out.println(a);
            }

        }//else {
          //  System.out.println("Найденная мебель : ");
          //  System.out.println(a);
       // }//
    }
}

