package Lab33;

/*Доработать класс из лабораторной работы №3.2, добавив наследников базового класса (количество - минимум 2).
Класс-наследник должен обязательно содержать хотя бы 1 собственное поле.
Разработанный класс должен содержать следующие методы:
	1)	конструкторы следующих видов:
		- конструктор без параметров;
		- конструктор, инициализирующий все переменные класса, значениями, заданными в качестве параметра,
		  реализованный через список инициализации с вызовом конструктора базового класса;
	2)	установки значений отдельных переменных класса (отдельные методы для каждой переменной);
	3)	получения значений отдельных переменных класса (отдельные методы для каждой переменной);
	4)	отображения на экране содержимого объекта класса;  (не надо создавать отдельный метод, используем
встроенный toString()
	5)	заполнения объекта класса с клавиатуры.
	6)	переопределенный метод базового класса							*/

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
       Bed a = new Bed();
       a.initialization();
       System.out.println(a.toString());

       Chair b = new Chair();
       b.initialization();
       System.out.println(b.toString());
    }
}
