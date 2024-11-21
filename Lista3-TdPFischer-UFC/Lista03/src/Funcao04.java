import java.util.Scanner;

public class Funcao04 {

	public static int QtdElements(int vector1[], int vector2[], int num) {
		int qtdNum=0;
		
		for(int i=0; i<vector1.length; i++) {
			if(vector1[i]==num)
				qtdNum++;
		}
		
		for(int i=0; i<vector2.length; i++) {
			if(vector2[i]==num)
				qtdNum++;
		}
		
		return qtdNum;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeVector;
		int numSearch;
		
		System.out.print("Qual a quantidade de numeros do primeiro vetor: ");
		sizeVector = Integer.parseInt(scan.nextLine());
		int vector1[] = new int[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Insira um numero p/ povoar o primeiro vetor: ");
			vector1[i]=Integer.parseInt(scan.nextLine());
		}

		
		System.out.print("Qual a quantidade de numeros do segundo vetor: ");
		sizeVector = Integer.parseInt(scan.nextLine());
		int vector2[] = new int[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			System.out.print("Insira um numero p/ povoar o segundo vetor: ");
			vector2[i]=Integer.parseInt(scan.nextLine());
		}
		
		System.out.print("Qual o numero vc deseja pesquisar nos vetores inseridos acima? ");
		numSearch = Integer.parseInt(scan.nextLine());
		
		System.out.printf("\n\nA quantidade de vezes que %d aparece nos vetores eh: %d", numSearch, QtdElements(vector1, vector2, numSearch));
		
		scan.close();

	}

}
