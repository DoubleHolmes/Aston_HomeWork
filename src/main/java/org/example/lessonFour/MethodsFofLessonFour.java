package org.example.lessonFour;

import java.util.Scanner;

public class MethodsFofLessonFour {

    /*Метод, который при вызове отпечатывает в столбец три слова:
     * Orange, Banana, Apple. */
    public void printThreeWords() {
        System.out.println("Задание 1:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*  Метод, который обрабатывает две переменные и выводит в консоль сообщение
     * " Сумма положительная" или "Сумма отрицательная". Ноль относится к положительному числу.*/
    public void checkSumSign() {
        int a = -15;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Задание 2: Сумма положительная");
        } else {
            System.out.println("Задание 2: Сумма отрицательная");
        }
    }

    /* Метод, который проверяет переменную value и вывод  в консоль сообщение
     * в зависимости от её величины (Красный если значение переменной < = 0,
     * Желтый если значение переменной >0  и <=  100, Зеленый если значение переменной >100). */
    public void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Задание 3: Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Задание 3: Желтый");
        } else {
            System.out.println("Задание 3: Зеленый");
        }
    }

    /*Метод, который сравнивает два числа, и выводит сообщение "a >= b" или "a < b" */
    public void compareNumbers() {
        int a = 3;
        int b = 4;
        if (a >= b) {
            System.out.println("Задание 4: a >= b");
        } else {
            System.out.println("Задание 4: a < b");
        }
    }

    /* Метод, который принимает из консоли два целых числа, и проверяет
     * в каком промежутке лежит их сумма (от 10 до 20 включительно - если да- выводит true,
     * если нет- выводит false.*/
    public void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5.");
        System.out.print("Введите целое число №1: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число №2: ");
        int b = scanner.nextInt();
        int c = a + b;
        boolean results = (c >= 10 && c <= 20);
        System.out.println("Ответ: " + results);
    }


    /*Метод, проверящий, явяляется ли число введеное с консоли, положительным или отрицательным. */
    public void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Ответ: Число положительно");
        } else {
            System.out.println("Ответ: Число отрицательное");
        }
    }

    /*Метод, которму передается целое число, и возвращает ответ отрицательное оно или положительно.
     * 0 считается положительным. */
    public void returnResult(int a) {
        boolean results = (a < 0);
        System.out.println("Ответ: " + results);
    }

    /*Метод, который принимает на вход строковую переменную и число,
     * и выводит эту строку, то количество раз, какое число указано.  */
    public void printLine(String text, int count) { //метод принимает параметры текст и кол-во
        System.out.println("Задание 8: ");
        for (int i = 0; i < count; i++) { // вывод строк нужное кол-во раз
            System.out.println(text);
        }
    }

    /*Метод определяет, является ли год високосным.
     * Каждый 4-год является високонсным, кроме каждого 100-го, при этом каждый 400- й високосный. */
    public void leapYear(int year) {
        boolean results = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        System.out.println("Ответ: " + results);
    }

    /*Метод, который принимает массив, состоящий из 1 и 0, и меняет все 1 на 0, 0 на 1. */
    public void arrayChange() {
        int[] array = {0, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1; // Заменяем 0 на 1
            } else {
                array[i] = 0; // Заменяем 1 на 0
            }
        }
        System.out.println("Задание 10: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    /* Метод создает пустой массив и заполняет его значениями от 1 до 100 */
    public void arrayLengthHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("\nЗадание 11: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    /*Метод, который проходит заданный массив и увеличивает элементы массива в два раза, те которые <6 */
    public void correctArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println("\nЗадание 12: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    /*Метод, создающий квадратный массив, и с помощью цикла заполняет его по диогонали единицами.*/
    public void findElementsArray() {
        int n = 5;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("\nЗадание 13: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");  //вывод массива с нововой строки
        }
    }

    /*Метод, создающий массив, динной len и заполняющий каждый его элемент значением initialValue. */
    public void lenInitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println("Задание 14:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}