package vetores;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[] A = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            A[i] = leia.nextInt();
        }

        System.out.println("\n--- Números Primos ---\n");


        for (int j = 0; j < 10; j++) {

            int n = A[j];
            int P = 1;


            if (n <= 1) { 
                P = 0;
            } 

            else { 

                for (int i = 2; i < n; i++) {


                    if (n % i == 0) {
                        P = 0;
                    }
                }
            }


            if (P == 1) { 
                System.out.print(n + " É primo");
                System.out.println();
            } else {
                System.out.print(n + " Não é primo");
                System.out.println();
            }
        }

        leia.close();
    }
}