package org.example.lessonFour.exerciseTwelve;
/*Метод, который проходит заданный массив и увеличивает элементы массива в два раза, те которые <6 */
public class ExerciseTwelve {
    public void correctArray() {
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++){
            if (array [i] < 6 ) {
                array [i] = array[i] * 2;
            }
        }
        System.out.println("Задание 12: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
