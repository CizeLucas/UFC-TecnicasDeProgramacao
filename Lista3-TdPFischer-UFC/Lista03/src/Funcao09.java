import java.util.Scanner;

public class Funcao09 {

	public static int LowestVal(int vector[], int index) {
		int lowestVal=vector[0];
		
		for(int i=1; i<=index; i++) {
			if(vector[i]<lowestVal)
				lowestVal = vector[i];
		}
		
		return lowestVal;
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
		
		System.out.printf("Insira ate qual index o programa deve buscar o menor valor (entre 0 e %d): ", sizeVector-1);
		inputIndex = Integer.parseInt(scan.nextLine());
		
		System.out.printf("\nO menor valor ate o index %d do vetor eh: %d.", inputIndex, LowestVal(vector, inputIndex));

		scan.close();
	}

}
