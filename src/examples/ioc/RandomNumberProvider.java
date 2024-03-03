package examples.ioc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberProvider {

    public List<Integer> getNumbers() {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int number = 0; number < 100; number++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }
}
