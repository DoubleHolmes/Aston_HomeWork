package org.example.lesson13;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        // Создаем массив с набором слов (включая повторяющиеся)
        String[] words = {
                "яблоко", "банан", "ананас", "апельсин", "банан",
                "виноград", "киви", "апельсин", "яблоко", "банан",
                "киви", "виноград", "мандарин", "дыня", "арбуз"
        };

        // HashMap для подсчета, сколько раз встречается каждое слово
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // Увеличиваем счетчик для каждого слова
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и их количество
        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}