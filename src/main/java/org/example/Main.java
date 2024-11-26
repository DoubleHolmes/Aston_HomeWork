package org.example;

import org.example.lessonFour.MethodsFofLessonFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodsFofLessonFour method = new MethodsFofLessonFour();

        //Задание 1.
        method.printThreeWords();
        // Задание 2.
        method.checkSumSign();
        // Задание 3.
        method.printColor();
        // Задание 4.
        method.compareNumbers();
        //Задание 5.
        method.checkNumbers();
        //Задание 6.
        System.out.println("Задание 6.\nВведите целое число: ");
        int a = scanner.nextInt();
        method.positiveOrNegative(a);
        // Задание 7.
        System.out.println("Задание 7.\nВведите целое число: ");
        int b = scanner.nextInt();
        method.returnResult(b);
        // Задание 8.
        method.printLine("Привет всем!", 5);
        //Задание 9.
        System.out.println("Задание 9.\nВведите год: ");
        int year = scanner.nextInt();
        method.leapYear(year);
        //Задание 10.
        method.arrayChange();
        //Задание 11.
        method.arrayLengthHundred();
        //Задание 12.
        method.correctArray();
        //Задание 13.
        method.findElementsArray();
        //Задание 14.
        method.lenInitialValue(5, 100);
        scanner.close();
    }
}
