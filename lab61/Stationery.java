package lab61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Stationery {

    private String name;
    private double cost;

    public Stationery() {
    }

    public Stationery(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Stationery(Scanner sc) {
        this.name = sc.next();
        this.cost = sc.nextDouble();
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void fillIn() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название:");
        this.name = reader.readLine();
        System.out.println("Введите цену:");
        this.cost = Double.parseDouble(reader.readLine());
    }

    @Override
    public String toString() {
        return "Название: " + name + "; Цена: " + cost;
    }

}
