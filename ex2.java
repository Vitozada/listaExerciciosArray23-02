package listaArray;

import java.util.Random;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random rand = new Random();
		double numeros[] = new double[5];

		for (int i = 0; i < 5; i++) {
			numeros[i] = rand.nextDouble(0, 20);
		}
	
		
		double maior = 0;
		
		for (int i = 0; i < 5; i++) {

			if (numeros[i] > maior) {
				maior = numeros[i];
			} 
		}
		System.out.printf("O maior numero do array é: %.2f ", maior);
	}
}
