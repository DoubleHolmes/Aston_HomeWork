package org.example.lesson10;

public class Main10 {

    public static void main(String[] args) {

        Animal dog1 = new Dog("Бадди");
        Animal cat1 = new Cat("Черныш");
        Animal dog2 = new Dog("Макс");
        Animal cat2 = new Cat("Зефирка");


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

        System.out.println("Добавление возможность у котов кушать из миски:");

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
            System.out.println(cat.getName() + " теперь " + (cat.isFull() ? "сыт." : "остался голодным."));
        }

        // Добавляем еду в миску
        bowl.addFood(15);

        // Коты пробуют покушать снова
        for (Cat cat : cats) {
            cat.eat(bowl, 5); // Каждый кот пытается съесть 5 еды
        }

        // Печатаем информацию о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " теперь " + (cat.isFull() ? "сыт." : "остался голодным."));
        }

        System.out.println("Общее количество созданных: " + Animal.getAnimalCount()); // Вывод: общее количество животных
    }
}
