package com.autoSchoolPartTwoAndTwo.first;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args){
        hello();             //можно просто метод вызывать hello(), ты же и так внутри класса Hello
        printHelloName();

    }

    public static void printHelloName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Hello," + name + "!");

    }

    public static void hello() {
        System.out.println("Hello World!");

    }
}


