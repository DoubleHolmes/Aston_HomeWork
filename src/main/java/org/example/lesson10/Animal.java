package org.example.lesson10;

// Базовый класс Animal
class Animal {
    private String name;
    private static int animalCount = 0; // Счетчик животных

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println("Животное е бегает.");
    }

    public void swim(int distance) {
        System.out.println("Животное не плавает.");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

// Класс Dog, наследующий от Animal
class Dog extends Animal {
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

// Класс Cat, наследующий от Animal
class Cat extends Animal {
    private boolean isFull; // Поле сытости

    public Cat(String name) {
        super(name);
        this.isFull = false; // Кот изначально голоден
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println(getName() + " не может пробежать более 200 метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать.");
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

// Класс FoodBowl для еды
class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0); // Не допускаем отрицательного количества еды
    }

    public void decreaseFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
