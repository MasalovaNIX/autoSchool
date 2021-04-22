package com.autoSchoolPartTwoAndTwo.com.welcome;
import java.util.Scanner;

public class Hello {

    private static String userName;

    public static void main(String[] args){
        Hello.setupName();
        Hello.welcome();
        Hello.byeBay();

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
