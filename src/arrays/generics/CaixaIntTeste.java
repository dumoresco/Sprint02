package arrays.generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar("Segredo");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
