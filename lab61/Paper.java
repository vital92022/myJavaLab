package lab61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Paper extends Stationery {

    private String format;

    public Paper() throws IOException {
        super();
        fillIn();
    }

    public Paper(String name, double cost, String format) {
        super(name, cost);
        this.format = format;
    }

    public Paper(Scanner sc){
        super(sc);
        this.format = sc.next();
    }

    public void fillIn() throws IOException {
        super.fillIn();
        System.out.println("Введите формат: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        setFormat(reader.readLine());
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void priseUp(double cost) {
        this.setCost(this.getCost() + 10);
        System.out.println("Цена товара " + this.getName() + " повышена до " + this.getCost());
    }

    @Override
    public String toString() {
        return super.toString() + " Формат: " + format;
    }
}
