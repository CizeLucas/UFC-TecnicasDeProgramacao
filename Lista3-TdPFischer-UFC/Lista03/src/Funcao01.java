import java.util.Scanner;

public class Funcao01 {

	public static int SumVector(int vector[]) {
		int sum=0;
		int sizeVector=vector.length;
		
		for(int i=2; i+2<sizeVector; i++)
			sum = sum + vector[i];
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos numeros vc quer inserir?\n(OBS: 2 primeiras e ultimas casas desconsideradas)");
		int sizeVector = Integer.parseInt(scan.nextLine());
		int vector[] = new int[sizeVector];
		
		System.out.println("Insira os numeros:");
		for(int i=0; i<sizeVector; i++)
			vector[i]=Integer.parseInt(scan.nextLine());

		System.out.println("A soma dos numeros do vetor eh: " + SumVector(vector));
		
		scan.close();
	}

}
