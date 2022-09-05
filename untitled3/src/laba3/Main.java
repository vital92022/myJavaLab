package laba3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1:");
        task1();
        System.out.println("Task2:");
        task2();
        System.out.println("Task4:");
        task4();
        System.out.println("Task9:");
        task9();
    }

    public static void task1(){
        String[] str = {"abcdefghijklmnopqrstuv18340", "abcdefghijklmnopqrstuv", "sfsgfsrfgtsg18340",
                "abcdefghijklmnopstuv18340", "lbdnbjkfhbujhc", "skgksfgkf", "uujythmnbvnbjg", "fjkgjitgtkjggfjnj"};
        for (int i = 0; i < 8; i++) {
            System.out.print(str[i].matches("^abcdefghijklmnopqrstuv18340$") + "  ");
            System.out.println(str[i]);
        }
        System.out.println();
    }

    public static void task2(){
        String[] str = {"{e02fa0e4-01ad-090A-c130-0d05a0008ba0}", "02fa0e4-01ad-090A-c130-0d05a0008ba0}", "e02fd0e4-00fd-090A-ca30-0d00a0038ba0",
                "e02fd0e400fd090Aca300d00a0038ba0", "e02fd0e4-00fd-090A-ca30-0d00a0038ba0", "40", "e02fd0e400fd090Aca300d00a0038ba0", "e02fd0e4-00fd-090A-ca30-0d00a0038ba0"};
        for (int i = 0; i < 8; i++) {
            System.out.print(str[i].matches("^[{(]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[)}]?$") + "  ");
            System.out.println(str[i]);
        }
        System.out.println();
    }

    public static void task4(){
        String[] str ={"#FFFFFF","#FF3421","#00ff00","FFFFFF","#FFFFFFF","#G226HF","#008080","#-5FFFF"};
        for (int i = 0; i < 8; i++) {
            System.out.print(str[i].matches("^#[0-9A-Fa-f]{6}$") + "  ");
            System.out.println(str[i]);
        }
        System.out.println();
    }

    public static void task9(){
        String[] str ={"+375-29-123-45-67","+375-44-123-45-67","+7-495-123-45-67","+7-29-123-45-67","+375-495-123-45-67","+375-44-123-pp-67","375-29-123-45-67","7-495-123-45-67"};
        for (int i = 0; i < 8; i++) {
            System.out.print(str[i].matches("^([+]375-[0-9]{2}-[0-9]{3}(-[0-9]{2}){2})|([+]7(-[0-9]{3}){2}(-[0-9]{2}){2})$") + "  ");
            System.out.println(str[i]);
        }
        System.out.println();
    }
}
