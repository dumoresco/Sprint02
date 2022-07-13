package arrays.generics;

public class Main {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();

        caixaA.guardar(2.3);// double -> Double

        // Cast explicito
        Double coisa = (Double) caixaA.abrir(); // Retorna um Object
        System.out.println(coisa);


        // Objeto com generics
        Caixa<String> caixa = new Caixa();

        String coisaA = caixa.abrir();
        caixa.guardar(coisaA);

    }
}
