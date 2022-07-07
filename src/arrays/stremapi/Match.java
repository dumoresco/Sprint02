package arrays.stremapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Convidado c1 = new Convidado("Eduardo", 18);
        Convidado c2 = new Convidado("Lucas", 52);
        Convidado c3 = new Convidado("Gabriel", 15);
        Convidado c4 = new Convidado("Carol", 25);

        List<Convidado> convidados = Arrays.asList(c1,c2,c3,c4);

        Predicate<Convidado> isOfAge = c -> c.idade >= 18;
        System.out.println(convidados.stream().allMatch(isOfAge));
        System.out.println(convidados.stream().anyMatch(isOfAge));
        System.out.println(convidados.stream().noneMatch(isOfAge));
    }
}
