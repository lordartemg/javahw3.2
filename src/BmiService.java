public class BmiService {
    public int calculate(double weightInKg, double heihghtInM) {
        double bmi = weightInKg / (heihghtInM * heihghtInM);
        return (int) bmi;

    }
}