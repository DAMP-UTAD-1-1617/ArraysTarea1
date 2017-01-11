package Ejercicio4;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
		// Utiliza este for para realizar el intercambio tal y como muestra el
		// gráfico
		for (int i = 5; i <= numeros.length-1; i++) {
			System.out.print(numeros[i] + " ");
		}
		for (int i = 0; i < numeros.length-5; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(numeros));
	}
}