package oopd7;

import java.util.ArrayList;

import oopd7.BOOK.Book;
import oopd7.BOOK.FictionBook;
import oopd7.BOOK.NonFictionBook;
import oopd7.Employee.Employee;
import oopd7.Employee.Engineer;
import oopd7.Employee.Manager;
import oopd7.shape.Circle;
import oopd7.shape.Rectangle;
import oopd7.shape.Shape;
import oopd7.vehicle.Car;
import oopd7.vehicle.Motorcycle;
import oopd7.vehicle.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        // question 1
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        Car car1 = new Car("Toyota", "Corolla", 20000, "Red", 4, 5);
        Car car2 = new Car("Honda", "Civic", 25000, "Blue", 4, 5);
        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "R1", 15000, "Black", "Sport", 1000);
        Motorcycle motorcycle2 = new Motorcycle("Harley Davidson", "roadster", 20000, "Orange", "Cruiser", 1200);
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(motorcycle1);
        vehicles.add(motorcycle2);

        System.out.println("List of Cars");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
            System.out.println(vehicle.toString());
            }
        }
        System.out.println();
        System.out.println("List of Motorcycles");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Motorcycle) {
            System.out.println(vehicle.toString());
            }
        }
        
        // question 2
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Circle circle1 = new Circle("Circle", "Red", 7);
        Circle circle2 = new Circle("Circle", "Green", 10);
        Rectangle rectangle1 = new Rectangle("Rectangle", "Blue", 5, 10);
        Rectangle rectangle2 = new Rectangle("Rectangle", "Yellow", 8, 12);

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);

        System.out.println("List of Shapes");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
        // question 3
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Manager manager1 = new Manager("kudus", 101, 50000, 10000);
        Manager manager2 = new Manager("kislu", 103, 60000, 12000);
        Engineer engineer1 = new Engineer("mojid", 102, 40000, 5000);
        Engineer engineer2 = new Engineer("hablu", 104, 45000, 6000);

        employees.add(manager1);
        employees.add(manager2);
        employees.add(engineer1);
        employees.add(engineer2);

        System.out.println("List of Employees");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("Total Salary: " + employee.calculateTotalSalary());
        }
         // question 4
         ArrayList<Book> books = new ArrayList<Book>();
         FictionBook fictionBook1 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "Classic");
         NonFictionBook nonFictionBook1 = new NonFictionBook("Sapiens", "Yuval Noah Harari", 15.99, "History");
 
         books.add(fictionBook1);
         books.add(nonFictionBook1);
 
         System.out.println("List of Books");
         for (Book book : books) {
             book.displayDetails();
         }

    }

}
