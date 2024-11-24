package org.example.lessonFour.exerciseSeven;

import java.util.Scanner;
/*Метод, которму передается целое число, и возвращает ответ отрицательное оно или положительно.
* 0 считается положительным. */
public class ExerciseSeven {
    public void returnResult(int a) {
        boolean results = (a < 0);
        System.out.println("Ответ: " + results);
    }
}
