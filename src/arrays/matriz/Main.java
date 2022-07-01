package arrays.matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        System.out.print("Quantos alunos: ");
        int qtdAlunos = s.nextInt();

        System.out.print("Quantas notas cada aluno: ");
        int qtdNota = s.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNota];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.print("Informe a nota " + (j+1) + " do aluno " + (i + 1) + ": ");
                notasDaTurma[i][j] = s.nextDouble();
                total += notasDaTurma[i][j];
            }
        }
        double media = total / ( qtdAlunos * qtdNota );
        System.out.println("Média da turma: " + media);

        s.close();




    }
}
