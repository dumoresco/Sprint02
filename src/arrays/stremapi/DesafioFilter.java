package arrays.stremapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

    Convidado c1 = new Convidado("Eduardo", 18, true);
    Convidado c2 = new Convidado("Luciano", 26, true);
    Convidado c3 = new Convidado("João", 16, true);
    Convidado c4 = new Convidado("Lucas", 17, true);
    Convidado c5 = new Convidado("Ana", 22, false);


    List<Convidado> convidados = Arrays.asList(c1,c2,c3,c4,c5);

        Predicate<Convidado> isOfAge = c -> c.idade >= 18;
        Predicate<Convidado> isInvited = c -> c.isInvited;
        Function<Convidado, String> welcomeMsg = c -> "Bem vindo a festa " + c.nome + "!";

        convidados.stream().filter(isInvited).filter(isOfAge).map(welcomeMsg).forEach(System.out::println);
    }
}
