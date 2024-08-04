package HACKERRANKandLEETCODE;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class javaStreams {

    public static void main(String[] args)
    {

        //1
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<String> result = words.stream().filter(word -> word.length() > 4).map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(result);

        //
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();

        //2
        int[] array = {1, 2, 3};
        IntStream intStream = Arrays.stream(array);
        List<Integer> l = intStream.boxed().collect(Collectors.toList());
        System.out.println(l);


        Stream<String> streamOfStrings = Stream.of("a", "b", "c");
        streamOfStrings.forEach(n-> System.out.println(n));


        List<String> modifiedWords = words.stream().map(word -> word.equals("java") ? "JAVA" : word).collect(Collectors.toList());
        System.out.println(modifiedWords);

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        a.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + "  "));



    }


}

