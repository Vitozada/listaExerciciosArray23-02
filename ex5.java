package listaArray;

public class ex5 {
	public static void main(String[] args) {
		int[] numeros = { 2, 4, 6, 7, 9, 11 }; // 3 pares e 3 impares

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " Esse numero é par!\n");
			}
		}
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] % 2 == 0) {
				soma += numeros[i];
			}
		}
		
		System.out.println(soma + " essa e a soma dos numeros pares \n");

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.println(numeros[i] + " Esse numero é impar!\n");
			}
		}
		
		int qtdImpares = 0;
		
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 != 0) {
				qtdImpares++;
			}
		}
		System.out.println("a quantidade de numeros impares no vetor é: " + qtdImpares);
	}
}
