package org.example.lessonSix;

public class Main {
    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Person[] persArray = new Person[5];

        // Заполнение массива объектами Person
        persArray[0] = new Person("Иван", "Иванов", "Иванович", "Менеджер", "ivanov@example.com", "+375-29-123-45-67", 50000.0, (byte) 30);
        persArray[1] = new Person("Петр", "Петров", "Петрович", "Разработчик", "petrov@example.com", "+375-29-765-43-21", 60000.0, (byte) 28);
        persArray[2] = new Person("Светлана", "Сидорова", "Сидоровна", "Дизайнер", "sidorova@example.com", "+375-29-111-22-22", 55000.0, (byte) 26);
        persArray[3] = new Person("Алексей", "Алексеев", "Алексеевич", "Аналитик", "alekseev@example.com", "+375-29-333-44-44", 70000.0, (byte) 35);
        persArray[4] = new Person("Мария", "Савостеева", "Дмитриева", "HR-менеджер", "savosteeva@example.com", "+375-29-555-66-66", 45000.0, (byte) 29);

        // Вывод информации в консоль о людях из массива
        for (Person person : persArray) {
            person.getInfAboutPerson(person);
        }

        //Создан парк с аттракционом
        Park park = new Park(new Attraction("Американские горки", "9:00", "21:00",
                10.95));

        // Вывод информации в консоль о парке
        System.out.println(park);
    }
}
