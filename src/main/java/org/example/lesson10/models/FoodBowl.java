package org.example.lesson10.models;

// Класс FoodBowl для еды
public class FoodBowl {
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
            System.out.println("\nДобавлено " + amount + " еды в миску.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}