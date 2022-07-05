package arrays.lambdas;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia");

        System.out.println("Forma tradicional: ");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda 1: ");
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("\nLambda 2: ");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\n Method Reference 1: ");
        aprovados.forEach(System.out::println);







    }

    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é " + nome);

    }
}
