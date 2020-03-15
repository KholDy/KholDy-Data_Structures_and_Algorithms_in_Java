package xyz.kholdy.array;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("Last name: " + lastName + ", First name: " + firstName + ", Age: " + age);
    }

    public String getLastName() {
        return lastName;
    }
}
