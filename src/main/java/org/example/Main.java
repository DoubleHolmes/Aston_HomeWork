package org.example;

import org.example.lessonFour.exerciseOne.ExerciseOne;
import org.example.lessonFour.exerciseTwo.ExerciseTwo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание 1.
        new ExerciseOne().printThreeWords();
        // Задание 2.
        new ExerciseTwo().checkSumSign();
        // Задание 3.
        //printColor();
        // Задание 4.
        //compareNumbers();
        //Задание 5.
        //checkNumbers();
        // Задание 6.
        //positiveOrNegative();
        // Задание 7.
        //returnResult();
        // Задание 8.
        //printLine("Привет всем!", 5);
        //Задание 9.
        //leapYear();
        //Задание 10.
        arrayChange();

    }
    // Задание 1.
    // Задание 2.

    // Задание 3.
    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Задание 3: Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Задание 3: Желтый");
        }
        else {
            System.out.println("Задание 3: Зеленый");
        }
    }
    // Задание 4.
    public static void compareNumbers() {
        int a = 3;
        int b = 4;

        if (a >= b) {
            System.out.println("Задание 4: a >= b");
        }
        else {
            System.out.println("Задание 4: a < b");
        }
    }
    // Задание 5.
    public static void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5.");
        System.out.print("Введите целое число №1: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число №2: ");
        int b = scanner.nextInt();
        int c = a + b;
        boolean results = (c >=10 && c <=20);
        System.out.println("Ответ: " + results);
        scanner.close();
    }
    // Задание 6.
    public static void positiveOrNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 6.");
        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Ответ: Число положительно");
        }
        else {
            System.out.println("Ответ: Число отрицательное");
        }
        scanner.close();
    }

    // Задание 7.
    public static void returnResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 7.");
        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        boolean results = (a < 0);
        System.out.println("Ответ: " + results);
        scanner.close();
    }
    // Задание 8.
        public static void printLine(String text, int count) { //метод принимает параметры текст и кол-во
            System.out.println("Задание 8: ");
            for (int i = 0; i < count; i++) { // вывод строк нужное кол-во раз
                System.out.println(text);
            }
        }

        //Задание 9.
        public static void leapYear() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 8.");
            System.out.print("Введите год: ");
            int year = scanner.nextInt();
            boolean results = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
            System.out.println("Ответ: " + results);
            scanner.close();
        }
        // Задание 10.
        public static void arrayChange() {
            int[] array = {0, 1, 0, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1; // Заменяем 0 на 1
                } else {
                    array[i] = 0; // Заменяем 1 на 0
                }
            }
            for (int num : array) {
                System.out.println("Заданин 10: ");
                System.out.print(num + " ");
            }

        }
}