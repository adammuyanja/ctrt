public class HealthUtils {
    // Static method can be used without creating an object
    public static double calculateBMI(double weightKg, double heightM) {
        return weightKg / (heightM * heightM);
    }
}

// Usage: double bmi = HealthUtils.calculateBMI(70, 1.75);

