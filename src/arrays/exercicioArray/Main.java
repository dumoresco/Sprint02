package arrays.exercicioArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quantas notas irá botar: ");
        int qtdNotas = s.nextInt();

        double[] notas = new double[qtdNotas];
        int n = 1;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + n++ + ": ");
            notas[i] = s.nextDouble();

        }


        double soma = 0;

        for ( double nota : notas) {
            soma += nota;
        }

        System.out.print("A média das notas é: " + soma / notas.length);

        s.close();




    }
}
