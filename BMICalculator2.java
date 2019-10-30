package BookPracticesAssignments2;

public class BMICalculator2 {
    public static void main(String[] args) {
        // Declare Variables

        double height;
        double weight;
        double bmi;

        // Compute BMI
        height = 70;
        weight = 195;
        bmi = weight / (height * height) * 703;

        // Print Results
        System.out.print("Previous BMI: ");
        System.out.print(bmi);

        // Recompute BMI
        weight = 180;
        bmi = weight / (height * height) * 703;

        // Report New Results
        System.out.println();
        System.out.print("Current BMI: ");
        System.out.print(bmi);
    }
}
