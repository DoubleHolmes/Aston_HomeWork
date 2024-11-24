package org.example.lessonFour.exerciseSix;

import java.util.Scanner;
/*Метод, проверящий, явяляется ли число введеное с консоли, положительным или отрицательным. */
public class ExerciseSix {
    public void positiveOrNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 6.");
        System.out.print("Введите целое число: ");
        double a = scanner.nextDouble();
        if (a >= 0) {
            System.out.println("Ответ: Число положительно");
        }
        else {
            System.out.println("Ответ: Число отрицательное");
        }
        scanner.close();
    }
}
