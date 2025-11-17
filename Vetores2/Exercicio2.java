package vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner ler = new Scanner(System.in);
		 
		 int[] a = new int[5];
		 
		 
	        for (int i = 0; i < 5; i++) {
	        	System.out.println("Por favor, digite 5 números inteiros:");
	            System.out.println(" "+ (i+1) + ": ");
	            a[i] = ler.nextInt();
	}
	        
	        
	        System.out.println("\n--- Tabuadas ---\n");
	        for (int elemento : a) {
	            System.out.println("Tabuada do " + elemento + ":");
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(elemento + " x " + i + " = " + (elemento * i));
	            }
	            
	           
	        }
	        
	       
	    }
	}
	        
