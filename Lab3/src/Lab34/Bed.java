package Lab34;

public class Bed extends Furniture implements IS {

    private Size size;

    public Bed() { super();}


    public Bed(String furniture, double price, Size size) {
        super(furniture, price);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size width) {
        this.size = width;
    }


    @Override
    public void buy() {
        System.out.println("Вы купили кровать!");
    }

    @Override
    public void recycling() {
        System.out.println("Товар утилизирован");
    }

    @Override
    public String toString() {
        return super.toString() + " Размер: " + size.getAllsize();
    }

    @Override
    public void priseUP(double price) {
        this.setPrice(this.getPrice()+100);
        System.out.println("Цена " + this.getFurniture() + " повышена до " + this.getPrice());
    }


}
