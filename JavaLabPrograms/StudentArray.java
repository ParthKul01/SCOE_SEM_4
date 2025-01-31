package JavaLabPrograms;

import java.util.Scanner;

// Define Student class
class Student {
    String name;
    int age;
    String course;
    int rollNumber;
    double marks;

    // Constructor to initialize the student object
    public Student(String name, int age, String course, int rollNumber, double marks) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("---------------------------------");
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n;
        while (true) {
            n = scanner.nextInt();
            if (n > 0) break;
            System.out.print("Invalid input. Enter a valid number of students: ");
        }
        scanner.nextLine(); // Consume newline

        // Array of Student objects
        Student[] students = new Student[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            String name;
            do {
                System.out.print("Name: ");
                name = scanner.nextLine().trim();
            } while (name.isEmpty());

            int age;
            while (true) {
                System.out.print("Age: ");
                age = scanner.nextInt();
                if (age > 0 && age <= 100) break;
                System.out.println("Invalid age. Please enter a valid age (1-100). ");
            }
            scanner.nextLine(); // Consume newline

            String course;
            do {
                System.out.print("Course: ");
                course = scanner.nextLine().trim();
            } while (course.isEmpty());

            int rollNumber;
            while (true) {
                System.out.print("Roll Number: ");
                rollNumber = scanner.nextInt();
                if (rollNumber > 0) break;
                System.out.println("Invalid roll number. Please enter a positive integer.");
            }

            double marks;
            while (true) {
                System.out.print("Marks: ");
                marks = scanner.nextDouble();
                if (marks >= 0 && marks <= 100) break;
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
            }
            scanner.nextLine();


            students[i] = new Student(name, age, course, rollNumber, marks);
        }


        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
