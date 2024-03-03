package examples.ioc;

import java.util.List;

public class Numbers {
    private RandomNumberProvider randomNumberProvider = new RandomNumberProvider();

    public int sumAll() {
        int sum = 0;
        for (Integer number : randomNumberProvider.getNumbers()) {
            sum += number;
        }
        return sum;
    }

    public double avarage() {
        int sum = 0;
        List<Integer> numbers = randomNumberProvider.getNumbers();
        for (Integer number : numbers) {
            sum += number;
        }
        return (double)sum / numbers.size();

    }
}
