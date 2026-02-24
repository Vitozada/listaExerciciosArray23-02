package listaArray;


import java.util.Random;

public class ex3 {
	public static void main(String[] args) {
		System.out.println("Programa do dado");

		Random rand = new Random();
		int lancamentos[] = new int[10];

		int ocorrencias = 0;

		for (int i = 0; i < 10; i++) {
			lancamentos[i] = rand.nextInt(1, 7);

			if (lancamentos[i] == 6) {
				ocorrencias++;
			}

		}
		int soma = 0;

		for (int i = 0; i < lancamentos.length; i++) {
			soma += lancamentos[i];
		}

		soma = soma / 10;

		System.out.printf("Média aritmetica: %d\nQuantidade de aparições do numero 6: %d", soma, ocorrencias);

	}
}
