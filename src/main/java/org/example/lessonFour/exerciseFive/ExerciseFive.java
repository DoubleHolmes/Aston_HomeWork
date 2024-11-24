package org.example.lessonFour.exerciseFive;

import java.util.Scanner;
/* Метод, который принимает из консоли два целых числа, и проверяет
* в каком промежутке лежит их сумма (от 10 до 20 включительно - если да- выводит true,
* если нет- выводит false.*/
public class ExerciseFive {
    public void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5.");
        System.out.print("Введите целое число №1: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число №2: ");
        int b = scanner.nextInt();
        scanner.close();
        int c = a + b;
        boolean results = (c >=10 && c <=20);
        System.out.println("Ответ: " + results);
    }
}
