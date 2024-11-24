package org.example.lessonFour.exerciseEleven;
/* Метод создает пустой массив и заполняет его значениями от 1 до 100 */
public class ExerciseEleven {
    public void arrayLengthHundred() {
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println("\nЗадание 11: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
