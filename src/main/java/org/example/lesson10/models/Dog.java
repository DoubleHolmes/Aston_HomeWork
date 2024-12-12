package org.example.lesson10.models;

// Класс Dog, наследующий от Animal
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println(getName() + " не может пробежать больше 500 метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " проплыл " + distance + " метров.");
        } else {
            System.out.println(getName() + " не может проплыть более 10 метров.");
        }
    }
}