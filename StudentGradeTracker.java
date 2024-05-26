import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter student grades (0-100). Type -1 to get the reasult:");

        while (true) {
            String input = sc.next();
            try {
                int grade = Integer.parseInt(input);
                if (grade == -1) {
                    break;
                } else if (grade >= 0 && grade <= 100) {
                    grades.add(grade);
                    System.out.println("Grade added: " + grade);  // Debug statement
                } else {
                    System.out.println("Invalid input. Please enter a grade between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer value.");
            }
        }

        if (grades.size() > 0) {
            int total = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);

            for (int grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = (double) total / grades.size();

            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        } else {
            System.out.println("NULL");
        }

        sc.close();
    }
}
