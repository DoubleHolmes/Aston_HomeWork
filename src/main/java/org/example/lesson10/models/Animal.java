package org.example.lesson10.models;


// Базовый класс Animal
public abstract class Animal {
    private String name;
    private static int animalCount = 0; // Счетчик животных

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + ": животное не бегает.");
    }

    public void swim(int distance) {
        System.out.println(name + ": животное не плавает.");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}