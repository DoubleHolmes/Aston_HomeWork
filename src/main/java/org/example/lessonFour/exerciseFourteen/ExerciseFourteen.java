package org.example.lessonFour.exerciseFourteen;
/*Метод, создающий массив, динной len и заполняющий каждый его элемент значением initialValue. */
public class ExerciseFourteen {
    public void lenInitialValue (int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = initialValue;
        }
        for (int num: arr) {
            System.out.println(num);
        }
    }
}
