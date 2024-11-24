package org.example.lessonFour.exerciseNine;

import java.util.Scanner;
/*Метод определяет, является ли год високосным.
* Каждый 4-год является високонсным, кроме каждого 100-го, при этом каждый 400- й високосный. */
public class ExerciseNine {
    public void leapYear(int year) {
        boolean results = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        System.out.println("Ответ: " + results);
    }
}
