import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Validate subject count
        while (numSubjects <= 0) {
            System.out.println("Invalid input! Number of subjects must be at least 1.");
            System.out.print("Enter the number of subjects: ");
            numSubjects = scanner.nextInt();
        }

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Loop to enter marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            int mark = scanner.nextInt();

            // Validate marks (0 to 100)
            while (mark < 0 || mark > 100) {
                System.out.println("Invalid marks! Enter a value between 0 and 100.");
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
                mark = scanner.nextInt();
            }

            marks[i] = mark;
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        char grade;

        // Assign grades
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
