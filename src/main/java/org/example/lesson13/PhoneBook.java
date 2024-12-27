package org.example.lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, _ -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        phoneBook.add("Иванов", "123456");
        phoneBook.add("Иванов", "789012");
        phoneBook.add("Петров", "345678");
        phoneBook.add("Сидоров", "901234");
        phoneBook.add("Смирнов", "789542");
        phoneBook.add("Смирнов", "789456");

        // Получаем номера по фамилии
        System.out.println("Номера для Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера для Петров: " + phoneBook.get("Петров"));
        System.out.println("Номера для Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Номера для Смирнов: " + phoneBook.get("Смирнов")); // Не найдено

    }
}
