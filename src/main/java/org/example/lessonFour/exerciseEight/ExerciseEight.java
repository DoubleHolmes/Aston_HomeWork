package org.example.lessonFour.exerciseEight;
/*Метод, который принимает на вход строковую переменную и число,
* и выводит эту строку, то количество раз, какое число указано.  */
public class ExerciseEight {
    public void printLine(String text, int count) { //метод принимает параметры текст и кол-во
        System.out.println("Задание 8: ");
        for (int i = 0; i < count; i++) { // вывод строк нужное кол-во раз
            System.out.println(text);
        }
    }
}
