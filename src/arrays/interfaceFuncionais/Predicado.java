package arrays.interfaceFuncionais;

import arrays.stremapi.Convidado;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Convidado c1 = new Convidado("Eduardo", 20);
        Convidado c2 = new Convidado("João", 19);
        Convidado c3 = new Convidado("Lucas", 18);
        Convidado c4 = new Convidado("Luciano", 17);

        List<Convidado> convidados = Arrays.asList(c1,c2,c3,c4);

        // Um Predicate retorna TRUE ou FALSE | Recebe um parâmetro
        Predicate<Convidado> isAgeOf = convidado -> convidado.idade >= 18;
        System.out.println(isAgeOf.test(c4));
    }

}
