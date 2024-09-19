package oopd6;

public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person();
        person1.setName("abdul kalam");
        person1.setAge(103);
        person1.setGender("male");
        person1.setAddress("bhuter goli,5 rtastar modhhe");

        Person person2 = new Person();
        person2.setName("rahim bepeari");
        person2.setAge(21);
        person2.setGender("male");
        person2.setAddress("biye bari road,kasi office");

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("John Doe");
        employee1.setSalary(5000);
        employee1.setDesignation("Software Engineer");

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setName("Jane Smith");
        employee2.setSalary(6000);
        employee2.setDesignation("HR Manager");
        
        System.out.println("Person 1: ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Sex: " + person1.getGender());
        System.out.println("Address: " + person1.getAddress());
        System.out.println();

        System.out.println("Person 2: ");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Sex: " + person2.getGender());
        System.out.println("Address: " + person2.getAddress());
        System.out.println();

        System.out.println("Employee 1: ");
        System.out.println("ID: " + employee1.getId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Designation: " + employee1.getDesignation());
        System.out.println();

        System.out.println("Employee 2: ");
        System.out.println("ID: " + employee2.getId());
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary: " + employee2.getSalary());
        System.out.println("Designation: " + employee2.getDesignation());
        System.out.println();
    }
}
