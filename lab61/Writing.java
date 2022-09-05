package lab61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Writing extends Stationery {

    private String rodColor;

    public Writing() throws IOException {
        super();
        fillIn();
    }

    public Writing(Scanner sc){
        super(sc);
        this.rodColor = sc.next();
    }

    public Writing(String name, double cost, String color) {
        super(name, cost);
        this.rodColor = color;
    }

    public String getRodColor() {
        return rodColor;
    }

    public void setRodColor(String rodColor) {
        this.rodColor = rodColor;
    }

    @Override
    public String toString() {
        return super.toString() + " Цвет стержня: " + rodColor;
    }

    public void fillIn() throws IOException {
        super.fillIn();
        System.out.println("Введите цвет стержня: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        setRodColor(reader.readLine());
    }
}
