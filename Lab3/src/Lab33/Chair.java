package Lab33;

import Lab32.Main2;
import java.io.IOException;
import java.util.Scanner;

public class Chair extends Main2.Furniture {
    private double high;

    public void setChair(Double size) {this.high = high;}

    public double getChair() { return high;}

    public Chair () { this ("Unknown",0.0,0.0);}

    public Chair(String furniture, double price, double high) {
        super(furniture,price);
        this.high = high;
    }

    @Override
    public void initialization () throws IOException {
        Scanner br = new Scanner(System.in);
        super.initialization();
        System.out.println("Введите высоту стула: ");
        this.high = br.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "\nВысота:  " + high;
    }


}
