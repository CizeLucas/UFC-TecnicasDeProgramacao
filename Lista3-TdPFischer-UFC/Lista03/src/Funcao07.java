import java.util.Scanner;

public class Funcao07 {

	public static boolean CheckOrder(int vector[]) {
		int vectorLength = vector.length;
		
		for(int i=0; i<vectorLength; i++)
			for(int j=(i+1); j<vectorLength; j++) {
				if(vector[i]>vector[j]) {
					return false;
				}
			}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o tamanho do vetor a ser ordenado: ");
		int sizeVector = Integer.parseInt(scan.nextLine());
		
		int vector[] = new int[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = Integer.parseInt(scan.nextLine());
		}
		
		if(CheckOrder(vector)) {
			System.out.println("O vetor inserido esta corretamente ordenado de forma crescente!");
		} else {
			System.out.println("O vetor inserido NAO esta ordenado de forma crescente!");
		}

		scan.close();

	}

}
