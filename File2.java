import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Validate input: Ensure at least one subject
        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects. Please enter a value greater than 0.");
            return; // Terminate the program if input is invalid
        }

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate input: Ensure marks are within 0-100 range
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                return; // Terminate if invalid marks are entered
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Assign grade based on average percentage
        String grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\n----- Results -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Method to calculate grade based on average percentage
    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
