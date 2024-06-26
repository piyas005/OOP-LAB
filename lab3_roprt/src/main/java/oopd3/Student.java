package oopd3;

public class Student {
    private String id;
    private String name;
    private String department;
    private double cgpa;
    private static String university;
    private static int totalStudents = 0;

    public Student(String id, String name, String department, double cgpa, String university) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        Student.university = university;
        totalStudents++;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }
}
