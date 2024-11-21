import java.util.Scanner;

public class Funcao14 {

	public static int[] RemoveNumFromVector(int vector[], int num) {
		int qtdPosNewVector=vector.length;
		int indexNewVector=0;
		
		for(int i=0; i<vector.length; i++)
			if(vector[i]==num) 
				qtdPosNewVector--;
		
		int newVector[] = new int[qtdPosNewVector];
		
		for(int i=0; i<vector.length; i++)
			if(vector[i]!=num) {
				newVector[indexNewVector] = vector[i];
				indexNewVector++;
			}
				
		return newVector;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeVector;
		int numToRemove;
		System.out.print("Insira o tamanho do primeiro vetor: ");
		sizeVector = Integer.parseInt(scan.nextLine());
		int vector[] = new int[sizeVector];
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = Integer.parseInt(scan.nextLine());
		}
		
		System.out.print("Qual elemento vc dejesa remover do vetor: ");
		numToRemove = Integer.parseInt(scan.nextLine());
		
		int UpdatedVector[] = RemoveNumFromVector(vector, numToRemove);
		
		System.out.printf("O vetor inserido com o numero %d removido eh: ", numToRemove);
		for(int i : UpdatedVector) {
			System.out.print(i+", ");
		}
		
		scan.close();
	}

}
