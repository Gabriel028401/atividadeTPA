package vetores;

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);
		        
		        int[] a = new int[10];
		        
		        int i;
		        
		        int elemento;
		        
		        int j;

		        
		        for (i = 0; i < 10; i++) {
		            System.out.print("Digite um " + (i + 1) + "° numero inteiro: ");
		            a[i] = leia.nextInt();
		        }

		        System.out.println("- Pares ate o elemento -");
		        for (i = 0; i < 10; i++) {
		            elemento = a[i];
		            System.out.print("Elemento " + elemento + ": Pares: ");
		            
		            j = 0;
		            
		            while (j <= elemento) {
		                
		                System.out.print(j);
		               
		                if (j + 2 <= elemento) {
		                    System.out.print(", ");
		                }
		                j = j + 2;
		            }
		        }
		    }
		}