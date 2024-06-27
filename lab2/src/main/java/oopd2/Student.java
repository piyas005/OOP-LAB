package oopd2;

public class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static String university;
    private static int totalStudents = 0;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++;
    }

    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }

    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }
}
