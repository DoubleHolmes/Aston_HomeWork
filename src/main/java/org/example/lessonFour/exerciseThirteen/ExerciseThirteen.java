package org.example.lessonFour.exerciseThirteen;
/*Метод, создающий квадратный массив, и с помощью цикла заполняет его по диогонали единицами.*/

public class ExerciseThirteen {
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
}
