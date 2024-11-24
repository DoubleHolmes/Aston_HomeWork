package org.example.lessonFour.exerciseTwo;
/*  Метод, который обрабатывает две переменные и выводит в консоль сообщение
* " Сумма положительная" или "Сумма отрицательная". Ноль относится к положительному числу.*/
public class ExerciseTwo {
    public void checkSumSign() {
        int a = -15;
        int b = 2;
        int c = a+b;

        if (c >= 0) {
            System.out.println("Задание 2: Сумма положительная");
        }
        else {
            System.out.println("Задание 2: Сумма отрицательная");
        }
    }
}
