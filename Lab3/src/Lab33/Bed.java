package Lab33;

import Lab32.Main2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bed extends Main2.Furniture {

    private double size;        //enum(1 2 десткая двух-этаж)

    public void setBed(Double size) {this.size = size;}

    public double getBed() { return size;}

    public Bed () { this ("Unknown",0.0,0.0);}

    public Bed(String furniture, double price, double size) {
        super(furniture,price);
        this.size = size;
    }

    @Override
    public void initialization () throws IOException {
        super.initialization();
        System.out.println("Введите размер кровати: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        this.size= Double.parseDouble(br1.readLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\nРазмер:  " + size;
    }


}
