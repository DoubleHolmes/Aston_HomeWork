package org.example.lesson10.models;

// Класс Cat, наследующий от Animal
public class Cat extends Animal {
    private boolean isFull = false; // Поле сытости

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println(getName() + " не может пробежать более 200 метров.");
        }
    }


    public void eat(FoodBowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true; // После еды кот становится сытым
            System.out.println(getName() + " съел " + amount + " еды и теперь сыт.");
        } else {
            System.out.println(getName() + " не ел, потому что не хватало еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}