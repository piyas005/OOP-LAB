package oopd5;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("showing person");
       Person person1 = new Person("mojid", 25,"male", "battery goli");
       Person person2 = new Person("kislu", 30, "male", "puran bari");
       System.out.println("Before overloading");
       person1.display();
       person2.display();

       System.out.println();
       
       person1.changePerson("mojidul");
       person2.changePerson(35);
       System.out.println("After overloading"); 
       person1.display();
       person2.display();

       System.out.println("showing employee");
    Employee employee1 = new Employee("John Doe", 35, "male", "123 Main St", 1001, 5000.0, "Manager");
    Employee employee2 = new Employee("Jane Smith", 28, "female", "456 Elm St", 1002, 4000.0, "Supervisor");

    System.out.println("Before overloading");
    employee1.display();
    employee2.display();

    System.out.println();

    employee1.changeEmployee(1003);
    employee2.changeEmployee(4500.0);
    System.out.println("After overloading");
    employee1.display();
    employee2.display();

       
    }
}

class Person{
    private String name;
    private int age;
    private String gender;
    private String address;

    // Constructor
    public Person(String name, int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    } 
    // constructor overloading
    public Person(String name, int age, String gender){
        this(name, age, gender, "");
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Genedr: " + gender);
        System.out.println("Address: " + address);
    }
    // method overloading of name property
    public void changePerson(String name){
        this.name = name;
    }
    public void changePerson( int age){
        this.age = age;
    }
}

class Employee {
    private Person person;
    private int id;
    private double salary;
    private String designation;

    // Constructor
    public Employee(String name, int age, String gender, String address, int id, double salary, String designation) {
        this.person = new Person(name, age, gender, address);
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public void display() {
        person.display();
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

    public void changeEmployee(int id) {
        this.id = id;
    }

    public void changeEmployee(double salary) {
        this.salary = salary;
    }

    public void changeEmployee(String designation) {
        this.designation = designation;
    }
}
