package com.autoSchoolPartTwoAndSix;

import java.lang.Thread;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        Main.taskone();     //можно без Main и опять наименования
        Main.tasktwo();
        Main.taskthree();
        Main.taskfour();
        Main.taskfive();
        Main.tasksix();
        Main.taskseven();
        Main.taskeight();
        Main.tasknine();
        Main.taskten();
        Main.taskeleven();
        Main.tasktwelve();
        Main.taskthirteen();
        Main.taskfourteen();
        Main.taskfifteen();
        Main.tasksixteen();
        Main.taskseventeen();
        Main.taskeightteen();

    }

    public static void taskone() throws IOException {

        System.out.println("Task 1");

        Scanner one = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = one.nextInt();
        int b = one.nextInt();
        if (a < b) {
            System.out.println("Min is " + a);      //просто для справки, можно так записать if: int min = (a < b) ? a : b;
        } else {
            System.out.println("Min is " + b);
        }
    }

    public static void tasktwo() throws IOException {
        System.out.println("Task 2");

        Scanner two = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; ++i) {
            int x = two.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println("Max is " + max);
    }

    public static void taskthree() throws IOException {
        System.out.println("Task 3");

        Scanner two = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        int x = two.nextInt();
        int y = two.nextInt();
        int z = two.nextInt();
        if (x >= y && x >= z && y > z) {
            System.out.println("Numbers in descending order: " + x + " " + y + " " + z);
        } else if (x >= y && z >= y && x >= z) {
            System.out.println("Numbers in descending order: " + x + " " + z + " " + y);
        } else if (y >= x && y >= z && x >= z) {
            System.out.println("Numbers in descending order: " + y + " " + x + " " + z);
        } else if (y >= x && y >= z && z >= x) {
            System.out.println("Numbers in descending order: " + y + " " + z + " " + x);
        } else if (z >= x && z >= y && x >= y) {
            System.out.println("Numbers in descending order: " + z + " " + x + " " + y);
        } else if (z >= x && z >= y && y >= x) {
            System.out.println("Numbers in descending order: " + z + " " + y + " " + x);        //с учётом, что задача на условные операторы - годится. Но в реальном проекте лучше засунуть всё в массив и отсортировать
        }
    }

    public static void taskfour() throws IOException {
        System.out.println("Task 4");

        Scanner first = new Scanner(System.in);
        System.out.println("Enter first name:");
        String s1 = first.nextLine();

        Scanner second = new Scanner(System.in);
        System.out.println("Enter second name:");
        String s2 = second.nextLine();

        if (s1.length() == s2.length()) {
            System.out.println("Lengths of names are equals.");
            for (int i = 0; i < s1.length(); i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);

                if (c1 != c2) {     // if (s1.equals(s2))
                    System.out.println("Names aren't equals.");
                    return;
                }
            }
            System.out.println("Names are equals.");
            return;
        }
        System.out.println("Names aren't equals.");
    }

    public static void taskfive() throws IOException {
        System.out.println("Task 5");

        Scanner first = new Scanner(System.in);
        System.out.println("Enter name:");
        String s1 = first.nextLine();

        Scanner second = new Scanner(System.in);
        System.out.println("Enter age:");
        int s2 = second.nextInt();

        if (s2 < 18) {
            System.out.println("Подрасти еще");
        }
        System.out.println("Go next.");
    }

    public static void tasksix() throws IOException {
        System.out.println("Task 6");

        Scanner first = new Scanner(System.in);
        System.out.println("Enter name:");
        String s1 = first.nextLine();

        Scanner second = new Scanner(System.in);
        System.out.println("Enter age:");
        int s2 = second.nextInt();

        if (s2 > 18) {      //а если 18?
            System.out.println("И 18-ти достаточно");
        }
        System.out.println("Go next.");
    }

    public static void taskseven() throws IOException {
        System.out.println("Task 7");

        Random random = new Random();
        int secret;
        // Генерируем число от 0 до 20
        secret = random.nextInt(20 + 1);
        System.out.println(secret); //я выигрываю в каждой игре с первой попытки ))

        Scanner first = new Scanner(System.in);
        System.out.println("Угадай число");
        System.out.println("7 попыток");
        System.out.println("Начинай");
        int num1;
        for (int i = 0; i < 7; i++) {
            num1 = first.nextInt();
            if (num1 == secret) {
                i = 7;      //хитро, но есть же break
                System.out.println("Выиграл");
            }
            if (num1 < secret) {
                System.out.println("Мало");
            }
            if (num1 > secret) {
                System.out.println("Много");
            }
            if (num1 != secret) {
                if (i == 6) {
                    System.out.println("Проиграл");
                }
            }
        }
    }

    public static void taskeight() throws IOException {
        System.out.println("Task 8");
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }


    }

    public static void tasknine() throws IOException {
        System.out.println("Task 9");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void taskten() throws IOException {
        System.out.println("Task 10");

        Scanner first = new Scanner(System.in);
        System.out.println("Enter string:");
        String s1 = first.nextLine();

        Scanner second = new Scanner(System.in);
        System.out.println("Enter number:");
        int s2 = second.nextInt();

        int i = s2;     //почему бы сразу не объявить int i = second.nextInt();
        while (i > 0) { //while (i <= s1) i++ - так будет правильнее и красивее
            System.out.println(s1);
            i--;

        }
    }

    public static void taskeleven() {
        System.out.println("Task 11");
        int i = 0;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.print("S");
                j++;
            }
            System.out.println("S");
            i++;
        }
    }

    public static void tasktwelve() throws IOException {
        System.out.println("Task 12");
        int i = 0;
        while (i < 11) {
            int j;
            j = i * 10;
            i++;
            System.out.println(" " + j);    //не очень похоже на таблицу умножения ))
        }
    }

    public static void taskthirteen() throws IOException {
        System.out.println("Task 13");

        for (int i = 2; i <= 100; i++)
            if (i % 2 == 0)
                System.out.print(" " + i);

    }

    public static void taskfourteen() throws IOException {
        //System.out.println("");
        System.out.println("Task 14\n");

        Scanner first = new Scanner(System.in);
        System.out.println("Enter height:");
        int h = first.nextInt();

        Scanner second = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = second.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 1; j < l; j++) {
                System.out.print("8");
            }
            System.out.println("8");
        }
    }

    public static void taskfifteen() throws IOException {
        System.out.println("");
        System.out.println("Task 15");

        for (int i = 0; i < 10; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println("8");
        }
    }

    public static void tasksixteen() throws IOException {
        System.out.println("Task 16");

        for (int i = 0; i < 10; i++) {
            System.out.print("8 ");
        }
        System.out.println("");
        for (int j = 0; j < 10; j++) {
            System.out.println("8");
        }
    }

    public static void taskseventeen() throws IOException {
        System.out.println("Task 17");

        Scanner first = new Scanner(System.in);
        System.out.println("Enter name:");
        String h = first.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(h + " любит меня)");
        }
    }

    public static void taskeightteen() throws InterruptedException {
        System.out.println("Task 18");
        for (int i = 30; i >= 0; i--) {
            Thread.sleep(100); //задержка на одну десятую секунды.
            System.out.println(i);
        }
        System.out.println("Бум!");
    }

}


























