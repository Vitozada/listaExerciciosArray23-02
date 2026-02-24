package listaArray;

public class ex4 {
	public static void main(String[] args) {
		int A[] = { 1, 0, 5, -2, -5, 7 };
		int soma = 0;

		for (int i = 0; i < A.length; i++) {
			soma += A[i];
		}
		System.out.println("Valor da soma é: " + soma + "\n");

		A[4] = 100;
		System.out.println("o valor de cada posição!");
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i] + "\n");
		}
	}
}
