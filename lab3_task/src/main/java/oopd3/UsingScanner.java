package oopd3;


import java.util.*;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        handleEmployeeDetails(scanner);

        handleBookDetails(scanner);

        handleStudentDetails(scanner);

        scanner.close();
    }

    private static void handleEmployeeDetails(Scanner scanner) {
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            employees.add(new Employee(name, age, salary, designation));
        }

        displayEmployeeDetails(employees);
    }

    private static void displayEmployeeDetails(List<Employee> employees) {
        System.out.println("**********");
        System.out.println("Employee Details:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees.get(i).display();
            System.out.println("**********");
        }
        System.out.println("**********");
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("**********");
    }

    private static void handleBookDetails(Scanner scanner) {
        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine();
        List<Book> books = new ArrayList<>();

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Publication Year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(title, author, publicationYear));
        }

        displayBookDetails(books);
    }

    private static void displayBookDetails(List<Book> books) {
        System.out.println("**********");
        System.out.println("Book Details:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book " + (i + 1) + ":");
            books.get(i).display();
            System.out.println("**********");
        }
        System.out.println("**********");
        System.out.println("Total Books: " + Book.getTotalBooks());
        System.out.println("**********");
    }

    private static void handleStudentDetails(Scanner scanner) {
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Department: ");
            String department = scanner.nextLine();

            students.add(new Student(rollNumber, name, department, cgpa));
        }

        displayStudentDetails(students);
    }

    private static void displayStudentDetails(List<Student> students) {
        System.out.println("**********");
        System.out.println("Student Details:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + ":");
            students.get(i).display();
            System.out.println("**********");
        }
        System.out.println("**********");
        System.out.println("Total Students: " + Student.getTotalStudents());
        System.out.println("**********");
    }

    static class Employee {
        private static int totalEmployees = 0;
        private String name;
        private int age;
        private double salary;
        private String designation;

        public Employee(String name, int age, double salary, String designation) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.designation = designation;
            totalEmployees++;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Designation: " + designation);
        }

        public static int getTotalEmployees() {
            return totalEmployees;
        }
    }

    static class Book {
        private static int totalBooks = 0;
        private String title;
        private String author;
        private int publicationYear;

        public Book(String title, String author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
            totalBooks++;
        }

        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publication Year: " + publicationYear);
        }

        public static int getTotalBooks() {
            return totalBooks;
        }
    }

    static class Student {
        private static int totalStudents = 0;
        private int rollNumber;
        private String name;
        private String department;
        private double cgpa;

        public Student(int rollNumber, String name, String department, double cgpa) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.department = department;
            this.cgpa = cgpa;
            totalStudents++;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Department: " + department);
            System.out.println("CGPA: " + cgpa);
        }

        public static int getTotalStudents() {
            return totalStudents;
        }
    }
}
