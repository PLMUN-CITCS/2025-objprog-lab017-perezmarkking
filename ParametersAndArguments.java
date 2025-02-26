import java.util.Scanner;

public class ParametersAndArguments {

    public static void calculateGrade(double u_score) {
        if (u_score >= 90) {
            System.out.println("Your grade is: A");
        } else if (u_score >= 80) {
            System.out.println("Your grade is: B");
        } else if (u_score >= 70) {
            System.out.println("Your grade is: C");
        } else if (u_score >= 60) {
            System.out.println("Your grade is: D");
        } else {
            System.out.println("Your grade is: F"); 
        }
    }

    public static void main(String[] args) {
        Scanner userscore = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double u_score = userscore.nextDouble();

        // Call the method to calculate grade
        calculateGrade(u_score);

        userscore.close();
    }
}


