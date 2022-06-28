package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 10.0;
        notasAlunoA[1] = 6.2;
        notasAlunoA[2] = 8.0;
        notasAlunoA[3] = 10.0;

        double totalA = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            totalA += notasAlunoA[i];
        }

        System.out.println("Média aluno A: " + totalA / notasAlunoA.length);

        double[] notasAlunoB = {3.2, 1.0, 9.8, 10.0};

        double totalB = 0;

        for (int i = 0; i < notasAlunoB.length; i++) {
            totalB += notasAlunoB[i];
        };

        System.out.println("Média aluno B: " + totalB / notasAlunoB.length);

    }
}
