package arrays.stremapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        // Stream.of é um método estático para criação de streams
        Stream<String> langs = Stream.of("Java ", "Javascript ", "Lua \n");
        langs.forEach(print);

        String[] maisLangs = { "Python ", "Perl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1,2).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "C# ", "C++ \n ");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);
    }
}
