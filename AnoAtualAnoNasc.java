package prjAula1;

import java.util.Scanner;
public class AnoAtualAnoNasc {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int anoAtual, anoNasc, i, r;
		
		do {
			System.out.println("Insira o ano atual:");
			anoAtual = in.nextInt();
			
			System.out.println("Insira o ano de nascimento:");
			anoNasc = in.nextInt();
			
			r = anoAtual - anoNasc;
			
			System.out.println("A idade do usuário é: "+r);
			
			System.out.println("Deseja continuar? 1- Continuar / 0- Sair");
			i = in.nextInt();
		}
		while (i==1);
	}
}