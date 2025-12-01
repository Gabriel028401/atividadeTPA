package vetores;

import java.util.Scanner;

public class Exercicio1Vetores {
	
	    public static void main(String[] args) {

	    
	        Scanner ler = new Scanner(System.in);

	     
	        int[] a = new int[20];


        
	        int[] b = new int[20];
	        
	        int j = 0; 
			//indice 2

	        
	        System.out.println("Por favor, digite 20 números inteiros:");
	        for (int i = 0; i < 20; i++) {
	            System.out.print("a[" + (i+1) + "]: ");
	            a[i] = ler.nextInt();
	        }

	        for (int i = 0; i < 20; i++) {
	            if (a[i] % 2 == 0) {
	                b[j] = a[i];
	                j++; 
	            }
	        }
	        for (int i = 0; i < 20; i++) {
	            if (a[i] % 2 != 0) {
	                b[j] = a[i];
	                j++; 
	            } 
	        }

	        System.out.println("\n--- Resultado do vetor B ---");
	        for (int i = 0; i < 20; i++) {
	            System.out.print(b[i] + " ");
	        }
	        System.out.println();
	  
	    }
	}
	
