public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Lucky T. Tiko", 19, "Computer Science", 85.5, 92.0, 88.5);
        Student student2 = new Student("Alexy Paradillo", 21, "Mathematics", 93.0, 92.5, 90.0);
        Student student3 = new Student("Jaja coleen", 20, "Physics", 75.0, 63.5, 70.0);

        Student[] students = {student1, student2, student3};
        int passingCount = 0;

        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("========================");


        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("---------");
            students[i].displayInfo();

            double average = students[i].calculateAverage();
            String letterGrade = students[i].getLetterGrade();
            boolean passing = students[i].isPassing();

            System.out.printf("Average: %.2f\n", average);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));

            if (passing) {
                passingCount++;
            }
        }


        System.out.println("\n========================");
        System.out.println("SUMMARY:");
        System.out.println("Total students: " + students.length);
        System.out.println("Students passing: " + passingCount);
        System.out.println("Students failing: " + (students.length - passingCount));
    }
}
