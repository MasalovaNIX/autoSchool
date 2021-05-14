package com.autoSchoolPartTwoAndFour;

import java.util.Scanner;

public class Main {

    //private static String yourstring;
    // зачем, если не используешь нигде?

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите два коротких предложения: ");
        // Hello, world. Hello, fghfhg.
        String yourString = in.nextLine();  //не забывай про Соглашения по именованию в Java "yourString"
        System.out.println(yourString);

        int length = yourString.length();
        System.out.println("Длина строки = " + length);

        char firsts = yourString.charAt(0);
        System.out.println("Первый символ = " + firsts);

        char last = yourString.charAt(length - 1);
        System.out.println("Последний символ = " + last);

        if ((length % 2 != 0))
            //System.out.println("Средний символ = " + yourString.substring((length-1)/2, length-((length-1)/2)));
            //зачем substring, если нужен только один символ? charAt() прекрасно подходит для этой цели
            System.out.println("Средний символ = " + yourString.charAt((length - ((length - 1) / 2))));
        else
            System.out.println("Средний символ отсутствует ");

        String part1 = yourString.substring(0, yourString.indexOf('.'));
        System.out.println("Часть строки до первой встреченной точки, включая точку: " + part1 + ".");
        //также предусмотрите вывод количества пробелов - ещё сказано в задании
        int spacesNum = 0;
        for (int i = 0; i < yourString.length(); i++) {
            if (yourString.charAt(i) == ' ') {
                spacesNum++;
            }
        }
        System.out.println("Количество пробелов: " + spacesNum);

        System.out.print("Введите фрагмент строки, который Вы хотите заменить: ");
        //Hello, world.
        String yourStringPart = in.nextLine();  //yourStringPart - так гораздо читабельнее
        System.out.println(yourStringPart);

        System.out.print("Введите новое предложение: ");
        //Hello, people.
        String yourStringChange = in.nextLine();
        System.out.println(yourStringChange);

        String replyYourString = yourString.replace(yourStringPart, yourStringChange);
        System.out.println("Новая строка: " + replyYourString);

        Scanner in4 = new Scanner(System.in);
        System.out.print("Введите строку слов разделенных пробелами: ");
        String yourStringWords = in.nextLine();
        System.out.println(yourStringWords);
        String[] word = yourStringWords.split(" ");
        String maxWord = "";
        for (int i = 0; i < word.length; i++)
            if (word[i].length() >= maxWord.length()) {
                maxWord = word[i];
            }
        System.out.println("Самое длинное слово в новой строке: " + maxWord);
    }
}

