package prjAula1;

import java.util.Scanner;
public class AnoBissexto {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int anoInicial, anoFinal, ano, contador=0;
		
		System.out.println("Digite o ano inicial:");
		anoInicial = in.nextInt();
		
		System.out.println("Digite o ano final:");
		anoFinal = in.nextInt();
		
		System.out.println("Anos bissextos no intervalo:");
		
		ano = anoInicial;
		
		while (ano <= anoFinal) {
			if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
				System.out.println(ano);
				contador++;
		}
			ano++;
		}
	}
}