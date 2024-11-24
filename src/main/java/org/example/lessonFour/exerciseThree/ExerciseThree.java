package org.example.lessonFour.exerciseThree;
/* Метод, который проверяет переменную value и вывод  в консоль сообщение
* в зависимости от её величины (Красный если значение переменной < = 0,
* Желтый если значение переменной >0  и <=  100, Зеленый если значение переменной >100). */
public class ExerciseThree {
    public void printColor() {
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
}
