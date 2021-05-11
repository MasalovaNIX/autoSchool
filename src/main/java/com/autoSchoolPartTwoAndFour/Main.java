package com.autoSchoolPartTwoAndFour;
import java.util.Scanner;

public class Main {

    private static String yourstring;   //зачем, если не используешь нигде?

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите два коротких предложения: ");
        // Hello, world. Hello, fghfhg.
        String yourstring = in.nextLine();  //не забывай про Соглашения по именованию в Java "yourString"
        System.out.println(yourstring);

        int length = yourstring.length();
        System.out.println("Длина строки = " + length);

        char firsts = yourstring.charAt(0);
        System.out.println("Первый символ = " + firsts);

        char last = yourstring.charAt(length-1);
        System.out.println("Последний символ = " + last);

        if((length % 2 != 0))
            System.out.println("Средний символ = " + yourstring.substring((length-1)/2, length-((length-1)/2)));    //зачем substring, если нужен только один символ? charAt() прекрасно подходит для этой цели
        else
            System.out.println("Средний символ отсутствует ");

        String part1 = yourstring.substring(0, yourstring.indexOf('.'));
        System.out.println("Часть строки до первой встреченной точки, включая точку: " + part1 + ".");  //также предусмотрите вывод количества пробелов - ещё сказано в задании

        Scanner in2 = new Scanner(System.in);   //объявила in2 и не используешь :)
        System.out.print("Введите фрагмент строки, который Вы хотите заменить: ");
        //Hello, world.
        String yourstringpart = in.nextLine();  //yourStringPart - так гораздо читабельнее
        System.out.println(yourstringpart);

        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите новое предложение: ");
        //Hello, people.
        String yourstringchange = in.nextLine();
        System.out.println(yourstringchange);

        String replyourstring = yourstring.replace(yourstringpart, yourstringchange);
        System.out.println("Новая строка: " + replyourstring);


        Scanner in4 = new Scanner(System.in);
        System.out.print("Введите строку слов разделенных пробелами: ");
        String yourstringwords = in.nextLine();
        System.out.println(yourstringwords);
        String [] word = yourstringwords.split(" ");
        String maxword = "";
        for(int i = 0; i < word.length; i++)
            if (word[i].length() >= maxword.length()) {
                maxword = word[i];
            }
        System.out.println("Самое длинное слово в новой строке: " + maxword);


    }


}

