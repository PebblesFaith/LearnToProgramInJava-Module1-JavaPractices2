package BookPracticesAssignments2;

public class BMICalculator1 {
    // Computes Body Mass Index (BMI) for a specific person.

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
        System.out.print("Current BMI: ");
        System.out.print(bmi);
    }
}
