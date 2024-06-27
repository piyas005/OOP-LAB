package oopd2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the company name: ");
        String companyName = scanner.nextLine();
        System.out.print("Enter the company address: ");
        String companyAddress = scanner.nextLine();
        Employee.setCompanyDetails(companyName, companyAddress);

        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age of employee " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter designation of employee " + (i + 1) + ": ");
            String designation = scanner.nextLine();
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            employees[i] = new Employee(name, age, designation, salary);
        }

        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
            System.out.println();
        }

        Employee.displayTotalEmployees();

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.print("Enter the genre of the books: ");
        String genre = scanner.nextLine();
        Book.setGenre(genre);

        Book[] books = new Book[3];
        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = scanner.nextLine();
            System.out.print("Enter year of book " + (i + 1) + ": ");
            int year = scanner.nextInt();
            scanner.nextLine();
            books[i] = new Book(title, author, year);
        }

        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }

        Book.displayTotalBooks();

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.print("Enter the university of the students: ");
        String university = scanner.nextLine();
        Student.setUniversity(university);

        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter ID of student " + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter department of student " + (i + 1) + ": ");
            String department = scanner.nextLine();
            System.out.print("Enter CGPA of student " + (i + 1) + ": ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(id, name, department, cgpa);
        }

        for (Student student : students) {
            student.displayStudentDetails();
            System.out.println();
        }

        Student.displayTotalStudents();

        scanner.close();
    }
}

