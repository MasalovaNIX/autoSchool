package com.autoSchoolPartThreeAndSix.figure;

import java.io.IOException;
import java.util.Random;

public class Square extends Figures {

    private String name;
    private static int i;

    private static int[] arrayX;
    private static int[] arrayY;
    double countArea;

    public Square(String name) {
        super(name);
    }


    public static void main(String[] args) throws IOException {
        Square squareOne = new Square("Square");

        countedArea(arrayX(), arrayY());
    }

    public static int[] arrayX() throws IOException {
        int[] arrayX = new int[4];
        Random random = new Random();
        for (int i = 0; i < arrayX.length; i++) {
            arrayX[i] = random.nextInt(50 + 1);
        }
        for (i = arrayX.length - 1; i >= 0; i--) {
            System.out.println(arrayX[i]);
        }
        return arrayX;
    }

    public static int[] arrayY() throws IOException {
        int[] arrayY = new int[4];
        Random random = new Random();
        for (int i = 0; i < arrayY.length; i++) {
            arrayY[i] = random.nextInt(50 + 1);
        }
        for (i = arrayY.length - 1; i >= 0; i--) {
            System.out.println(arrayY[i]);
        }
        return arrayY;
    }

    public static void setArrayX(int[] arrayX) {

        Square.arrayX = arrayX;
    }

    public static void setArrayY(int[] arrayY) {

        Square.arrayY = arrayY;
    }

    public static int[] getArrayX() {

        return arrayX;
    }

    public static int[] getArrayY() {

        return arrayY;
    }


    public static void countedArea(int[] arrayX, int[] arrayY) throws IOException {

        double area = Math.sqrt(((arrayX[1] - arrayX[0]) * (arrayX[1] - arrayX[0])) + ((arrayY[1] - arrayY[0]) * (arrayY[1] - arrayY[0])));
        //return area;
        System.out.println(area);
    }
}
