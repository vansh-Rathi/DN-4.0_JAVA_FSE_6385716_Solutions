public class Main {
    public static void main(String[] args) {
        double initialAmount = 5000.0;
        double growthRate = 0.15;
        int years = 8;
        
        double futureValue = FinancialForecast.calculateFutureValue(initialAmount, growthRate, years);
        
        System.out.printf("Future value after %d years: Rs. %.2f\n", years, futureValue);
    }
}