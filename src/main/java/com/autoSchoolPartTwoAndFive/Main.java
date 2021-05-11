package com.autoSchoolPartTwoAndFive;

import java.io.*;
import java.util.Scanner;


public class Main {

    private static int i;

    public static void main(String[] args) throws Exception {
        Main.initializeArray();
        Main.initializeArrayTwo();
        Main.initializeArrayThree();
        Main.initializeArrayFour();
        Main.initializeArrayFive();
    }

    public static void initializeArray() throws IOException {   //метод initializeArray должен только создавать и возвращать массив. Ещё нужен дополнительный метод max(int[] array), который уже будет искать максимальное число. И его можно будет использовать много раз и в любом месте

        System.out.println("Задание 1");
        Scanner write = new Scanner(System.in);
        System.out.println("Введите двадцать чисел:");
        int[] arrayOne = new int[20];

        for (int i = 0; i < 20; i++) {
            arrayOne[i] = write.nextInt();
        }
        System.out.println("Ваш массив:");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }

        System.out.println("Длинна массива:" + arrayOne.length);    //зачем?))

        int max = arrayOne[0];
        for (int i = 1; i < arrayOne.length; i++) {
            if (arrayOne[i] > max)
                max = arrayOne[i];
        }

        System.out.println("Максимальное значение равно: " + max);
    }

    public static void initializeArrayTwo() throws IOException {
        System.out.println("Задание 2");
        String[] arrayTwo = new String[10];
        System.out.println("Длинна массива:" + arrayTwo.length);

        Scanner writeTwo = new Scanner(System.in);
        System.out.println("Введите восемь чисел:");

        for (int t = 0; t < 8; t++) {
            arrayTwo[t] = writeTwo.nextLine();
        }
        System.out.println("Массив в обратном порядке:");
        for (int t = 0; t < arrayTwo.length; t++) {     //усложнила. можно так: for (int t = array.length - 1; t >= 0; t--) То есть, цикл начнёт брать слова с последнего места в массиве
            int j = arrayTwo.length - t - 1;

            System.out.println(arrayTwo[j]);
        }
    }

    public static void initializeArrayThree() throws IOException {
        System.out.println("Задание 3");
        String[] arrayThree = new String[10];   //arrayString и arrayInt было бы понятнее
        int[] arrayFour = new int[10];

        Scanner write3 = new Scanner(System.in);
        System.out.println("Введите десять строк:");
        for (i = 0; i < 10; i++) {
            arrayThree[i] = write3.nextLine();
        }

        for (i = 0; i < arrayThree.length; i++) {
            arrayFour[i] = arrayThree[i].length();
        }
        System.out.println("Массив с длинами строк:");
        for (i = 0; i < arrayFour.length; i++)
            System.out.println(arrayFour[i]);
    }

    public static void initializeArrayFour() throws IOException {

        System.out.println("Задание 4");

        Scanner write4 = new Scanner(System.in);
        System.out.println("Введите десять чисел:");
        int[] arrayFive = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            arrayFive[i] = write4.nextInt();
        }

        System.out.println("Массив в обратном порядке:");
        for (i = arrayFive.length -1; i >= 0; i--){
            System.out.println(arrayFive[i]);
        }

    }

    public static void initializeArrayFive() throws IOException {

        System.out.println("Задание 5");

        int[] arraySix = new int[20];
        Scanner write5 = new Scanner(System.in);
        System.out.println("Введите двадцать чисел:");

        for (i = 0; i < 20; i++) {
            arraySix[i] = write5.nextInt();
        }
        int[] arraySeven = new int[10];
        System.arraycopy(arraySix, 0, arraySeven, 0, 9);
        //System.out.println("Первый массив из первых десяти чисел:");
        //for (int i = 0; i < arraySeven.length; i++)
        //    System.out.println(arraySeven[i]);

        int[] arrayEight = new int[10];
        System.arraycopy(arraySix, 10, arrayEight, 0, 10);
        System.out.println("Второй массив из последних десяти чисел:");
        for (i = 0; i < arraySeven.length; i++)
            System.out.println(arrayEight[i]);
    }

}










