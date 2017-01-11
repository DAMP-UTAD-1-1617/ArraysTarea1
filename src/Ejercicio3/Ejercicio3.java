package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner in = new Scanner(System.in);
	public static int[] elementos = new int[5];
	public static String inReverse(int[] values) {
		String message = "";
		for (int k = elementos.length - 1; k >= 0; k--) {
			message += elementos[k] + " ";

		}
		return message;
		}

	public static void main(String[] args) {
		
		for (int i = 0; i < elementos.length; i++) {
			
		
		System.out.println("Introduzca los valores: ");
		elementos[i] = in.nextInt();
		}
		Arrays.sort(elementos);
		String message = "";
		
		
		Ejercicio3 miEjercicio= new Ejercicio3();
		System.out.println(inReverse(elementos));
	}

}
