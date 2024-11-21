import java.util.Scanner;

public class Funcao05 {

	public static int[] copyVector(int vector[]) {
		int copiedVector[] = new int[vector.length];
		
		for(int i=0; i<vector.length; i++)
			copiedVector[i] = vector[i];
		
		return copiedVector;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeVector;
		
		System.out.print("Qual a quantidade de numeros do vetor: ");
		sizeVector = Integer.parseInt(scan.nextLine());
		int vector[] = new int[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Insira o numero: ");
			vector[i]=Integer.parseInt(scan.nextLine());
		}
		
		int copiedVector[] = copyVector(vector);
		
		System.out.print("A copia do vetor inserido acima eh: ");
		for(int i=0; i<copiedVector.length; i++ )
			System.out.print(copiedVector[i]+", ");
		
		scan.close();

	}

}
