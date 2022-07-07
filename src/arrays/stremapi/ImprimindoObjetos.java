package arrays.stremapi;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Eduardo", "Lucas", "João", "Luciano");


        System.out.println("\nUsando FOREACH");

        for (String nome:
             aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando ITERATOR");
        Iterator<String> iterator = aprovados.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando STREAM");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
