import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}