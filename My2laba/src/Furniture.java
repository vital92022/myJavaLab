import java.io.IOException;
import java.util.Scanner;

public class Furniture {

    public String furniture;
    public double price;

    public Furniture() {
    }

    public Furniture(String furniture, double price) {
        this.furniture = furniture;
        this.price = price;
    }

    public String getFurniture() {
        return furniture;
    }

    public double getPrice() {
        return price;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void initialization() throws IOException {
        Scanner br = new Scanner(System.in);
        System.out.println("Введите модель мебели: ");
        this.furniture = br.nextLine();
        System.out.println("Введите стоимость мебели: ");
        this.price = br.nextDouble();
    }


    public String toString() {
        return "Модель: " + furniture + "; Цена: " + price+ "; ";
    }
}
