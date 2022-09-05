package Lab32;
import Lab31.Main1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
Переработать класс из лабораторной работы №3.1, сделав все переменные – члены класса частными (private) и
добавив в класс следующие методы:
	1)	установки значений отдельных переменных класса (отдельные методы для каждой переменной);
	2)	получения значений отдельных переменных класса (отдельные методы для каждой переменной);
	3)	отображения на экране содержимого объекта класса; (не надо создавать отдельный метод, используем
встроенный toString()
	4)	заполнения объекта класса с клавиатуры.
	5)	добавить коструктор, инициализирующий все переменные класса, значениями, заданными в качестве параметра.*/


public class Main2 {
    public static void main(String[] args) throws IOException {
        Furniture a = new Furniture();
        a.initialization();
        System.out.println(a);
        a.setFurniture("Диван");
        System.out.println(a.getFurniture());
        a.setPrice(305);
        System.out.println(a.getPrice());
    }

    public static class Furniture {
        private double price;
        private String furniture;

        public Furniture() {

        }

        public void setPrice(double price) { this.price = price;}

        public void setFurniture(String furniture) { this.furniture = furniture;}

        public double getPrice() { return price;}

        public String getFurniture() { return  furniture;}

        @Override
        public String toString() { return "Мебель: " + furniture + "\nЦена: " + price;}

        public void initialization () throws IOException {
            Scanner br = new Scanner(System.in);
            System.out.println("Введите модель мебели: ");
            this.furniture = br.nextLine();
            System.out.println("Введите стоимость мебели: ");
            this.price = br.nextDouble();
        }

        public Furniture(String furniture, double price) {
            this.furniture = furniture;
            this.price = price;
        }

    }
}
