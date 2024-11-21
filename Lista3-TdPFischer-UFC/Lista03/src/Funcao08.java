import java.util.Scanner;

public class Funcao08 {

	public static int BiggestVal(int vector[], int index) {
		int biggestVal=0;
		
		for(int i=0; i<=index; i++) {
			if(vector[i]>biggestVal)
				biggestVal = vector[i];
		}
		
		return biggestVal;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeVector;
		int inputIndex;
		
		System.out.print("Insira o tamanho do vetor: ");
		sizeVector = Integer.parseInt(scan.nextLine());
		
		int vector[] = new int[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = Integer.parseInt(scan.nextLine());
		}
		
		System.out.printf("Insira ate qual index o programa deve buscar o maior valor (entre 0 e %d): ", sizeVector-1);
		inputIndex = Integer.parseInt(scan.nextLine());
		
		System.out.printf("\nO maior valor ate o index %d do vetor eh: %d", inputIndex, BiggestVal(vector, inputIndex));

		scan.close();
	}

}
