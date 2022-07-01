package arrays.Equals;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Eduardo";
        u1.idade = 20;

        Usuario u2 = new Usuario();
        u2.nome = "Eduardo";
        u2.idade = 20;

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));


    }
}
