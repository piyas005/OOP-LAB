package oopd2;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    private static String companyName;
    private static String companyAddress;
    private static int totalEmployees = 0;

    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
    }

    public static void setCompanyDetails(String name, String address) {
        companyName = name;
        companyAddress = address;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }
}

