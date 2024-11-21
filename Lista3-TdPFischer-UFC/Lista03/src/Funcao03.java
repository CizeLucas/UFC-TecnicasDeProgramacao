import java.util.Scanner;

public class Funcao03 {

	public static float WeightedAvg(float vector[], float weights[]) {
		float sum=0;
		float sumWeights=0;
		
		for(int i=0; i<vector.length; i++) {
			sum = sum + vector[i]*weights[i];
			sumWeights = sumWeights + weights[i];
		}
		
		return sum/sumWeights;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de numeros que vc deseja tirar a media ponderada: ");
		int sizeVector = Integer.parseInt(scan.nextLine());
		float vector[] = new float[sizeVector];
		float weights[] = new float[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Insira o numero: ");
			vector[i]=Integer.parseInt(scan.nextLine());
			System.out.print("Insira o seu peso: ");
			weights[i]=Integer.parseInt(scan.nextLine());
		}

		System.out.printf("A media ponderada dos numeros do vetor eh: %.2f", WeightedAvg(vector, weights));
		
		scan.close();
	}

}
