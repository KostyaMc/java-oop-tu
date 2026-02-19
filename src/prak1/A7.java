package prak1;

public class A7 {
    public static void main(String[] args){
        String name = args[0];
        int weight = Integer.parseInt(args[1]);
        double height = Double.parseDouble(args[2]);

        double bmi = weight / (height * height);

        String formattBMI = String.format("%.2", bmi);

        System.out.println("Hello, " + name + "!");
        System.out.println("Your body mass index: " + formattBMI);

        System.out.print("Recommendations: ");
        if (bmi < 18.5) {
            System.out.println("You need to eat better. Eat more calorie-rich and healthy foods.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You're at a healthy weight. Keep it up! Stay in shape.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight. Try to exercise more and watch your diet.");
        } else {
            System.out.println("You are obese. We recommend consulting a doctor and reviewing your lifestyle.");
        }
    }
}
