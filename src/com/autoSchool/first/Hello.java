package com.autoSchool.first;
import java.util.Scanner;

public class Hello {

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


