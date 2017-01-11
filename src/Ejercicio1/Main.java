package Ejercicio1;

import java.util.Scanner;

public class Main {
	int[] notas;
	Scanner sc;

	public void pedirNotas(int cantidad) {
		sc = new Scanner(System.in);
		notas = new int[cantidad];
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduzca la nota del elemento %d: ", i + 1);
			notas[i] = sc.nextInt();
		}
	}

	/**
	 * Programa este método para que calcule la media de los datos del vector
	 */
	public void calcularMedia() {
		notas=
		System.out.println("La nota media de los datos es: ");
	}

	public static void main(String[] args) {
		Main ejemplo = new Main();
		// Averigua cómo introducir un número en args[0] desde eclipse
		int elementos = Integer.parseInt(args[0]);
		ejemplo.pedirNotas(elementos);
		ejemplo.calcularMedia();
	}
}