package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private final Scanner scanner = new Scanner(System.in);
    private final List<String> students = new ArrayList<>();

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.mainMenu();
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\nWelcome to the student manager!");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. View all students");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addStudent();
                case "2" -> removeStudent();
                case "3" -> viewStudents();
                case "4" -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addStudent() {
        System.out.print("Enter New Student Name: ");
        String name = scanner.nextLine();
        students.add(name);
        System.out.println(name + " is Added Successfully!");
    }

    public void removeStudent() {
        System.out.print("Enter Student name to remove: ");
        String name = scanner.nextLine();

        if (students.contains(name)) {
            students.remove(name);
            System.out.println(name + " has been removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found in the system.");
            return;
        }

        System.out.println("--- Student List ---");
        for (String name : students) {
            System.out.println(name);
        }
    }
}