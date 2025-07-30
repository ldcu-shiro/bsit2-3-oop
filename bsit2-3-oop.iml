import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student Information Input
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        // Display Student Information
        System.out.println("\n=== STUDENT INFORMATION ===");
        System.out.println("Student ID      : " + studentId);
        System.out.println("Student Name    : " + firstName + " " + lastName);
        System.out.println("Course          : " + course);
        System.out.println("Section         : " + section);

        // Scores Input
        System.out.print("\nEnter Midterm Exam Score     : ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter Final Exam Score       : ");
        int finalScore = scanner.nextInt();

        System.out.print("Enter Project Score          : ");
        int projectScore = scanner.nextInt();

        System.out.print("Enter Attendance Percentage  : ");
        int attendanceScore = scanner.nextInt();

        // Calculate Average and Remarks
        double averageScore = (midtermScore + finalScore + projectScore + attendanceScore) / 4.0;
        String remarks = (averageScore >= 75) ? "PASSED" : "FAILED";

        // Display Scores
        System.out.println("\n=== STUDENT SCORES ===");
        System.out.println("Midterm Exam     : " + midtermScore);
        System.out.println("Final Exam       : " + finalScore);
        System.out.println("Project          : " + projectScore);
        System.out.println("Attendance       : " + attendanceScore);
        System.out.printf("Average Score    : %.2f%n", averageScore);
        System.out.println("Remarks          : " + remarks);

        scanner.close();
    }
}
