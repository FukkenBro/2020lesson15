import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {

//    1.) Создать список случайных чисел. Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.

    private static final Random RANDOM = new Random();
    private static final double MAX = 10;
    private static final int SIZE = 15;

    public static void main(String[] args) {
        double result = initList().stream().mapToDouble((d) -> d = Math.pow(d, 2)).average().getAsDouble();
        System.out.printf("Result of stream: %.2f", result);
    }

    private static List<Double> initList() {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(RANDOM.nextDouble() * MAX);
        }
        System.out.println(list);
        return list;
    }
}
