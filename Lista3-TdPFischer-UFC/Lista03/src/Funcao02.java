import java.util.Scanner;

public class Funcao02 {

	public static float CalcAvg(int vector[]) {
		float sum=0;
		int sizeVector=vector.length;
		
		for(int i=0; i<sizeVector; i++)
			sum = sum + vector[i];
		
		return sum/sizeVector;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc quer inserir?");
		int sizeVector = Integer.parseInt(scan.nextLine());
		int vector[] = new int[sizeVector];
		
		System.out.println("Insira os numeros:");
		for(int i=0; i<sizeVector; i++)
			vector[i]=Integer.parseInt(scan.nextLine());

		System.out.println("A media dos numeros do vetor eh: " + CalcAvg(vector));
		
		scan.close();
	}

}
