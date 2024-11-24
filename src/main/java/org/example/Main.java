package org.example;

import org.example.lessonFour.exerciseEight.ExerciseEight;
import org.example.lessonFour.exerciseFive.ExerciseFive;
import org.example.lessonFour.exerciseFour.ExerciseFour;
import org.example.lessonFour.exerciseOne.ExerciseOne;
import org.example.lessonFour.exerciseSeven.ExerciseSeven;
import org.example.lessonFour.exerciseSix.ExerciseSix;
import org.example.lessonFour.exerciseThree.ExerciseThree;
import org.example.lessonFour.exerciseTwo.ExerciseTwo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задание 1.
//        new ExerciseOne().printThreeWords();
//        // Задание 2.
//        new ExerciseTwo().checkSumSign();
//        // Задание 3.
//        new ExerciseThree().printColor();
//        // Задание 4.
//        new ExerciseFour().compareNumbers();
//        //Задание 5.
//        new ExerciseFive().checkNumbers();
        // Задание 6.
        System.out.println("Задание 6.\n Введите целое число: ");
        int a = scanner.nextInt();
        new ExerciseSix().positiveOrNegative(a);
        // Задание 7.
        System.out.println("Задание 7.\n  Введите целое число: ");
        int b = scanner.nextInt();
        new ExerciseSeven().returnResult(b);
        // Задание 8.
        new ExerciseEight().printLine("Привет всем!", 5);
        //Задание 9.
        //leapYear();
        //Задание 10.
       // arrayChange();

    }
    // Задание 8.

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