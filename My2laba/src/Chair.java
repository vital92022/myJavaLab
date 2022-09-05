import java.io.IOException;
import java.util.Scanner;

public class Chair extends Furniture {
    private double high;

    public void setChair(Double size) {this.high = high;}

    public double getChair() { return high;}

    public Chair() throws IOException {
        this ("Unknown",0.0,0.0);
        this.initialization();
    }

    public Chair(String furniture, double price, double high) {
        super(furniture,price);
        this.high = high;
    }
    public void initialization () throws IOException {
        Scanner br = new Scanner(System.in);
        super.initialization();
        System.out.println("Введите высоту кресла: ");
        this.high = br.nextDouble();
    }
    @Override
    public String toString() {
        return super.toString() + "Высота: " + high;
    }
}

