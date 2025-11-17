package vetores;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int TAM=10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
            
            System.out.println("Digite os valores de A ");
        for (int i = 0; i < TAM; i++) A[i] = in.nextInt();
        for (int i = 0; i < TAM; i++) B[i] = in.nextInt();

        int k = 0; // índice de C

        for (int i = 0; i < TAM; i++) {

            int repete = 0;

            for (int j = 0; j < TAM; j++) {
                if (A[i] == B[j]) repete = repete + 1;
            }
              
            if (repete == 0) {
                C[k] = A[i];
                k = k + 1;
            }
        }
           System.out.println("Vetor C:");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }
    }
}


