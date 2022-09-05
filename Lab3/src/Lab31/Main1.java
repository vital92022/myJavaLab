package Lab31;

/*
Описать класс, содержащий информацию об одном из понятий (см. варианты). В классе не должно быть методов.
Все переменные – члены класса должны быть открытыми (public).
В функции main() выполнить следующие действия: описать объект класса, создать объект класса.
После описания или создания объектов выполнить заполнение их с клавиатуры и вывод на экран.
Мебель
*/

public class Main1 {
    public static void main (String[] args){

        Furniture a;
        a = new Furniture();

        a.furniture = "table";
        a.price = 350.5;

        System.out.println("Мебель: " + a.furniture + "\nЦена: " + a.price);
    }


    public static class Furniture {
        public String furniture;
        public double price;
    }
}
