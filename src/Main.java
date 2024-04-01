//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService bmiIndex = new BmiService();

        double weightInKg = 79;
        double heihghtInM = 1.93;

        int bmi = bmiIndex.calculate(weightInKg, heihghtInM);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
