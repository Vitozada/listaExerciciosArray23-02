package listaArray;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double [] numeros= {10,20,30,40,50};
		int opcao;
		
		do {
			System.out.printf(">>MENU<<\n[1]- Ordem direta \n[2]- Ordem reversa \n[0]- Sair\n");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				for (int i = 0; i < numeros.length; i++) {
					System.out.print("posição " + (i + 1) + ": " + numeros[i] + "\n");
				}
				break;
				
			case 2:
				for (int i = 4; i >= 0; i--) {
					System.out.print("posição " + (i + 1) + ": " + numeros[i] + "\n");

				}
				break;
			default:
				System.err.println("Opção Invalida!");
				break;
			}
			
		} while (opcao != 0);
	}

}
