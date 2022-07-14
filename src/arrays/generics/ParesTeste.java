package arrays.generics;

public class ParesTeste {
    public static void main(String[] args) {

        Pares<Integer, String> pares = new Pares();

        pares.add(1, "Item 01");
        pares.add(null, "Item 02");
        pares.add(3, "Item 03");

        System.out.println(pares.getValue(3));




    }
}
