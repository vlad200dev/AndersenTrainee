package task_3.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Тренировка обработки данных
 */
public class Homework {
    public static void main(String[] args) {
        int[] someArray = {3, 4, 6, 1, 2, 8, 9, 10, 15};
        // найти наибольшее
        // найти наименьшее
        // найти общее число элементов
        // вывести все элементы на консоль, ктр больше 5
        // вывести количество элементов, ктр меньше 5
        // посчитать сумму всех элементов
        IntStream stream1 = IntStream.of(someArray);
        IntSummaryStatistics summaryStatistics = stream1.summaryStatistics();
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getSum());
        stream1.filter(x -> x > 5).forEach(System.out::println);
        long count = stream1.filter(x -> x < 5).count();
        System.out.println(count);


        String sentence = "This was a best offer man can ever imagine";
        // разбить каждую букву по ячейке в массиве
        // отсортировать буквы по алфавиту
        // убрать повторяющиеся буквы
        // все буквы в большие
        // склеить буквы в одно слово
        // вывести на экран
        String[] array = sentence.replace(" ", "").toLowerCase().split("");
        String newOne = Arrays.stream(array).sorted().distinct().map(String::toUpperCase).collect(Collectors.joining());
        System.out.println(newOne);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        Stream.concat(numbers.stream(), numbers2.stream()).filter(x -> x >= 10).forEachOrdered(x -> System.out.println(x + " "));


        IntFunction<IntFunction<IntFunction<Integer>>> someFunction = x -> y -> z -> x * y + z;
        int result = someFunction.apply(3).apply(5).apply(5);
        System.out.println(result);


    }
}
