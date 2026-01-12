import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume newline

                    Student s = new Student(id, name, age);
                    students.add(s);
                    System.out.println("Student added successfully!");
                }

                case 2 -> {
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Student s : students) {
                            s.displayStudent();
                            System.out.println("-------------------");
                        }
                    }
                }

                case 3 -> System.out.println("Exiting program...");

                default -> System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
