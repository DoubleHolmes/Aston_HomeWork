package org.example.lessonSix;

public class Person {

    public String firstName;
    public String lastName;
    public String surName;
    public String position;
    public String email;
    public String number;
    public double salary;
    public byte age;

    public Person(String firstName, String lastName, String surName,
                  String position, String email, String number,
                  double salary, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    /*Метод, который выводит информацию о человеке*/
    public void getInfAboutPerson(Person person){
        System.out.println(person);
    }
}
