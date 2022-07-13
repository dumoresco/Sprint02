package arrays.exceção;

public class Basico {

    public static void main(String[] args) {
        try{
            System.out.println(0 / 0);
        }catch (ArithmeticException excecao){
            System.out.println("Número não é dividido por 0");
        }
    }

}
