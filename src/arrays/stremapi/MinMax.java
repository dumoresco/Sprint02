package arrays.stremapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Convidado c1 = new Convidado("Eduardo", 18);
        Convidado c2 = new Convidado("Lucas", 12);
        Convidado c3 = new Convidado("Gabriel", 200);
        Convidado c4 = new Convidado("Carol", 25);

        List<Convidado> convidados = Arrays.asList(c1,c2,c3,c4);

        Comparator<Convidado> maisVelho = (conv1,conv2) -> {
            if(conv1.idade > conv2.idade) return 1;
            if(conv1.idade < conv2.idade) return -1;
            return 0;
        };

        System.out.println(convidados.stream().max(maisVelho).get());
        System.out.println(convidados.stream().min(maisVelho).get());
    }
}
