package oopd6;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;
    
    // // Constructor
    // public Employee(String name, int id, double salary, String designation) {
    //     this.name = name;
    //     this.id = id;
    //     this.salary = salary;
    //     this.designation = designation;
    // }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
