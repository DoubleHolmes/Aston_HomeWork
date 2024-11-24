package org.example.lessonFour.exerciseTen;
/*Метод, который принимает массив, состоящий из 1 и 0, и меняет все 1 на 0, 0 на 1. */
public class ExerciseTen {
    public void arrayChange() {
        int[] array = {0, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1; // Заменяем 0 на 1
            } else {
                array[i] = 0; // Заменяем 1 на 0
            }
        }
        for (int num : array) {
            System.out.println("Задание 10: ");
            System.out.print(num + " ");
        }
    }
}
