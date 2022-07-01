package arrays.collections;

import arrays.Equals.Usuario;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Set
        HashSet set = new HashSet();

        set.add(2);
        set.add("2");
        set.add(true);
        set.add("String");

        set.remove(2);
        set.remove(true);

        System.out.println(set);



        // List

        ArrayList<Usuario> lista = new ArrayList<>();


        lista.add(new Usuario("Eduardo", 20));
        lista.add(new Usuario("João", 18));
        lista.add(new Usuario("Lucas", 12));
        lista.add(new Usuario("Gabriel", 23));

        System.out.println(lista.get(3).nome); // acessar pelo indice
        lista.remove(0);
        lista.remove(new Usuario("João", 18));
        System.out.println(lista.contains(new Usuario("Lucas", 12))); // output: true

//        for(Usuario u: lista){
//            System.out.println(u);
//        }




        // Queue

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adiciona elementos na fila
        // Diferença é o comportamento quando a fila está cheia
        fila.add("Ana"); // retorna false
        fila.offer("Bia");  // Lança uma excessão
        fila.offer("Eduardo");
        fila.offer("João");
        fila.offer("Lucas");

        fila.remove(); // remove o primero valor que entrou - lança uma excessão

        // Diferença é o comportamento quando a fila está vazia

        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.element()); // Lança uma excessão

        System.out.println(fila);

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains();


        System.out.println(fila.poll()); // retorna o valor e remove da fila - se estiver vazia retorna false;
        System.out.println(fila);


        // Stack

        Deque<String> pilha = new ArrayDeque<>();

        pilha.add("Livro 1"); // retorna true ou false
        pilha.push("Livro 2"); // não retorna nada
        pilha.push("Livro 3");



        System.out.println(pilha.peek());
        System.out.println(pilha.remove());

    }

}
