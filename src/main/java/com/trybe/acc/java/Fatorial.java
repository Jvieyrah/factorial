package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;


public class Fatorial {

	public static void main(String[] args) {
	    //Seu código aqui
		// Ler a entrada de um número pelo console
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite um número:");
		int valor = scan.nextInt();
		
		// Seu código aqui
		int fatorial = calcularFatorial(valor);
		scan.close();
			
			// Imprime a saída no console. OBS: descomente a próxima linha
			System.out.println("O fatorial de " + valor + " é "  + fatorial);

	}
	
	
	public static int calcularFatorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			int fatorial = 1;
			for (int i = 1; i<= n; i++) {
				fatorial *= i;
			}
			return fatorial;
		}
	}
}
