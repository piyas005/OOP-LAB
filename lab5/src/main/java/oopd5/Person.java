package oopd5;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    // Constructor overloading
    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person(String name, int age) {
        this(name, age, "", "");
    }

    public Person(String name) {
        this(name, 0, "", "");
    }

    // Method overloading
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + "Name: " + name);
        System.out.println(prefix + "Age: " + age);
        System.out.println(prefix + "Gender: " + gender);
        System.out.println(prefix + "Address: " + address);
    }
}
