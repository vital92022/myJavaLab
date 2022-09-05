package Lab34;

public abstract class Furniture {

    public String furniture;
    public double price;

    public Furniture(){}

    public Furniture(String furniture, double price){
        this.furniture = furniture;
        this.price = price;
    }

    public String getFurniture(){
        return furniture;
    }

    public double getPrice(){
        return price;
    }

    public void setFurniture(String furniture){
        this.furniture = furniture;
    }

    public void setPrice(double price){
        this.price = price;
    }


    public String toString(){
        return "Модель: " + furniture + "; Цена: " + price;
    }

    public abstract void priseUP(double price);
}
