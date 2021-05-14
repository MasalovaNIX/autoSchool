package com.autoSchoolPartTwoAndTwo.com.welcome;
import java.util.Scanner;

public class Hellotwo {

    private static String userName;

    public static void main(String[] args){
        //не совсем понимаю, зачем здесь тоже вызываешь методы?
        // Это же вспомогательный класс, а все вызовы в MainTwo уже идут
//        Hellotwo.setupName();
//        Hellotwo.welcome();
//        Hellotwo.byeBay();
    }

    public static void setupName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        userName = in.nextLine();

    }

    public static void welcome() {

        System.out.println("Hello," + userName + ".");
    }
    public static void byeBay() {

        System.out.println("Bye," + userName + ".");
    }
}
