import java.util.List;

public class GenericExercise {

    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void addSampleIntegers(List<? super Integer> target) {
        target.add(1);
        target.add(2);
        target.add(3);
    }

    public static <T> List<T> repeat(T value, int count) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(value);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(10, 20, 30);
        List<Double> doubleList = List.of(1.5, 2.5);
        List<String> stringList = List.of("Hi");

        System.out.println("Sum of integers: " + sumNumbers(intList));
        System.out.println("Sum of doubles: " + sumNumbers(doubleList));
        addSampleIntegers(intList);
        System.out.println("Integer List after adding sample integers: " + intList);
        System.out.println(repeat("Hello", 3));
    }
}