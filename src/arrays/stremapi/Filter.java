package arrays.stremapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Eduardo", 9.2);
        Aluno a2 = new Aluno("João", 8.6);
        Aluno a3 = new Aluno("Lorenzo", 2.2);
        Aluno a4 = new Aluno("Lucas", 7.5);
        Aluno a5 = new Aluno("Luciano", 3.9);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> msgAprovado = a -> "Parabéns " + a.nome + "! Você foi APROVADO!";

        alunos.stream().filter(aprovado)
                .map(msgAprovado)
                .forEach(System.out::println);
    }
}
