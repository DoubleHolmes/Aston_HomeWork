package org.example.lesson10.task2;

public interface Shape {
    double area(); // Метод для расчета площади
    double perimeter(); // Метод для расчета периметра

    String getFillColor(); // Метод для получения цвета заливки
    String getBorderColor(); // Метод для получения цвета границ

    // Дефолтный метод для вывода характеристик фигуры
    default void printProperties() {
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
        System.out.println("Площадь: " + area());
        System.out.println("Периметр: " + perimeter());
    }
}