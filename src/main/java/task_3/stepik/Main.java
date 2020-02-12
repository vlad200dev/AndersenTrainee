package task_3.stepik;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Write a lambda expression that accepts a long value and returns a next even number.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list.stream().filter(x -> x % 2 == 0).map(x -> x + 2).forEach(System.out::println);

        // distinct words in the list
        List<String> string = Arrays.asList("java", "scala", "java", "clojure", "clojure");
        List<String> StringNew = string.stream().distinct().collect(Collectors.toList());
        System.out.println(StringNew); // [java, scala, clojure]

        //Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
        // The order of elements in the result list may be any (elements will be sorted by the testing system).
        String sequence = "java scala java clojure clojure";
        String[] array = sequence.replace(" ", "").toLowerCase().split("");
        List<String> finalList = Arrays.stream(array).distinct().collect(Collectors.toList());
        System.out.println(finalList); // [j, a, v, s, c, l, o, u, r, e]

        /*
        Using closure write a lambda expression that calculates a*x^2 + b*x + c where a, b, c are context final variables.
        They will be available in the context during testing.
        Note, the result is double.
         */
        int a = 1, b = 4, c = 5;
        Function<Integer, Double> squareEquation = x -> a * Math.pow(x, 2) + b * x + c;
        System.out.println(squareEquation.apply(2));

        /*
        Using closure write a lambda expression that adds prefix (before) and suffix (after) to its single string argument;
        prefix and suffix are final variables and will be available in the context during testing
         */
        final String x = "prefix";
        final String y = "suffix";
        Function<String, String> expression = (word) -> {
            StringBuilder pref = new StringBuilder();
            StringBuilder original = new StringBuilder(word);
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) != ' ') {
                    pref.append(x.charAt(i));
                }
            }
            for (int u = 0; u < y.length(); u++) {
                if (y.charAt(u) != ' ') {
                    original.append(y.charAt(u));
                }
            }
            return "" + pref.append(original);
        };
        System.out.println(expression.apply("Hello"));


    }
}
