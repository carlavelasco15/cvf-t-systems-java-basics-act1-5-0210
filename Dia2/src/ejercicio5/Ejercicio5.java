package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		int aux = 0;
		
		System.out.println("Valor inicial:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);
		System.out.println("");
		
		aux = B;
		
		B = C;
		C = A;
		A = D;
		D = aux;
		
		System.out.println("Valor final:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);
	}

}
