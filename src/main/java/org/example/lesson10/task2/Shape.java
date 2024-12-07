package org.example.lesson10.task2;

public interface Shape {
    double area(); // Метод для расчета площади
    double perimeter(); // Метод для расчета периметра

    String getFillColor(); // Метод для получения цвета заливки
    String getBorderColor(); // Метод для получения цвета границ

    // Дефолтный метод для вывода характеристик фигуры
    default void printProperties() {
        System.out.println("Fill Color: " + getFillColor());
        System.out.println("Border Color: " + getBorderColor());
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

// Класс Circle, реализующий интерфейс Shape
class Circle implements Shape {
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Класс Rectangle, реализующий интерфейс Shape
class Rectangle implements Shape {
    private final double width;
    private final double height;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Класс Triangle, реализующий интерфейс Shape
class Triangle implements Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        double s = perimeter() / 2; // Полу периметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Формула Герона
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        System.out.println("Circle Properties:");
        circle.printProperties();
        System.out.println();

        System.out.println("Rectangle Properties:");
        rectangle.printProperties();
        System.out.println();

        System.out.println("Triangle Properties:");
        triangle.printProperties();
    }
}
