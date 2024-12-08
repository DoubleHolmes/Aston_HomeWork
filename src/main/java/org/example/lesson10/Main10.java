package org.example.lesson10;


import org.example.lesson10.models.Animal;
import org.example.lesson10.models.Cat;
import org.example.lesson10.models.Dog;
import org.example.lesson10.models.FoodBowl;
import org.example.lesson10.task2.Circle;
import org.example.lesson10.task2.Shape;
import org.example.lesson10.task2.Triangle;
import org.example.lesson10.task2.Rectangle;

public class Main10 {

    public static void main(String[] args) {

        Animal dog1 = new Dog("Бадди");
        Animal cat1 = new Cat("Черныш");
        Animal dog2 = new Dog("Макс");
        Animal cat2 = new Cat("Зефирка");

        System.out.println("Задание 1: \n");
        dog1.run(300);  // Вывод: Бадди пробежал 300 метров.
        dog1.swim(5);   // Вывод: Бадди проплыл 5 метров.
        dog1.swim(15);  // Вывод: Бадди не может проплыть более 10 метров.

        cat1.run(150);  // Вывод: Черныш пробежал 150 метров.
        cat1.run(250);  // Вывод: Черныш не может пробежать больше 200 метров.
        cat1.swim(5);   // Вывод: Черныш не умеет плавать.

        dog2.run(600);  // Вывод: Макс не может пробежать больше 500 метров.
        dog2.swim(100);  // Вывод: Макс не может проплыть более 10 метров.

        cat2.run(170);  // Вывод: Зефирка пробежал 170 метров.
        cat2.swim(7);  // Вывод: Зефирка не умеет плавать.

        System.out.println("\nДобавление возможность у котов кушать из миски: ");

        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Снежок"),
                new Cat("Гарфилд")
        };

        FoodBowl bowl = new FoodBowl(20); // Создаем миску с 20 едой

        // Все коты пытаются покушать из миски
        for (Cat cat : cats) {
            cat.eat(bowl, 10); // Каждый кот пытается съесть 10 еды
        }

        // Печатаем информацию о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + (cat.isFull() ? " наелся." : "остался голодным."));
        }

        // Добавляем еду в миску
        bowl.addFood(15);

        // Коты пробуют покушать снова
        for (Cat cat : cats) {
            cat.eat(bowl, 5); // Каждый кот пытается съесть 5 еды
        }

        // Печатаем информацию о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + (cat.isFull() ? " наелся." : " остался голодным."));
        }

        System.out.println("\nОбщее количество созданных животных: " + Animal.getAnimalCount()); // Вывод: общее количество животных

        System.out.println("\nЗадание 2: ");
        Shape circle = new Circle(5, "Red", "Black");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");
        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        System.out.println("Параметры круга:");
        circle.printProperties();
        System.out.println();

        System.out.println("Параметры прямоугольника:");
        rectangle.printProperties();
        System.out.println();

        System.out.println("Параметры треугольника:");
        triangle.printProperties();
    }
}