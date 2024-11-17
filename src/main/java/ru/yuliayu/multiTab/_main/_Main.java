package ru.yuliayu.multiTab._main;

import java.util.Scanner;

public class _Main {
    public static void main (String[] args){
        //Задание 1
        for(int i = 2; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        //Задание 2
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точки A (x, y): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Введите координаты точки B (x, y): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("A: (" + x1 + ", " + y1 + ") B: (" + x2 + ", " + y2 + ")");
        double lengthAB = Math.sqrt (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("Длина отрезка AB: " + lengthAB);

    }
}
