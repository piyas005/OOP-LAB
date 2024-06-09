package oop_lab1;


public class App 
{
    public static void main( String[] args ){
        student s1=new student();
        s1.id=101;
        s1.name="sakib";
        s1.email="sakib@gmail.com";
        s1.cgpa=3.81;
        s1.hometown="khulna";

        student s2= new student();
        s2.id=102;
        s2.name="tamim";
        s2.email="tamim@gmail.com";
        s2.cgpa=3.55;
        s2.hometown="bagura";

        s1.display();

        System.out.println("ID: "+s2.id);
        System.out.println("ID: "+s2.name);
        System.out.println("ID: "+s2.email);
        System.out.println("ID: "+s2.cgpa);
        System.out.println("ID: "+s2.hometown);

        System.out.println("------------------------------");
        System.out.println("------------------------------");


        BankAccount account1 = new BankAccount("123456789", 500.0);
        BankAccount account2 = new BankAccount("987654321", 1000.0);

        account1.deposit(200.0);
        account2.deposit(300.0);

        account1.withdraw(100.0);
        account2.withdraw(150.0);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.0, 4.0);

        rect1.displayDetails();
        rect2.displayDetails();

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Movie movie1 = new Movie("Inception", "Science Fiction", "Leonardo DiCaprio", "Christopher Nolan", 2010, 8.8);
        Movie movie2 = new Movie("The Room", "Drama", "Tommy Wiseau", "Tommy Wiseau", 2003, 3.7);

        movie1.displayDetails();
        System.out.println();
        movie2.displayDetails();

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
    }

}
