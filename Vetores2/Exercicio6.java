package vetores;

public class Exercicio6 {

	    public static void main(String[] args) {
	    	
	    	final int TAM = 11; 
	    	
	    	int a[]; 

	    	a = new int[TAM];

	        int potenciaA = 1; 
	        int i;
	        
	        i = 0;
	        while (i < TAM) {
	            
	            a[i] = potenciaA; 	            
	            
	            System.out.println("A[" + i + "] = 2^" + i + " = " + a[i]);
	            	            
	            potenciaA = potenciaA * 2; 
	            i = i + 1;
	        }
	    }
	}