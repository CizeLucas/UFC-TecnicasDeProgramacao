import java.util.ArrayList;
import java.util.Scanner;
public class Questao07v2 {

	public static void main(String[] args) {
		//Uma implementacao do Crivo de Eratóstenes para encontrar numeros primos
		
		Scanner scan = new Scanner(System.in);
		int numLimite;
		int numPrimo=0;
		boolean isPrimo = true;
		ArrayList<Integer> numCheck = new ArrayList<Integer>();
		
		System.out.print("Insira o numero limite: ");
		numLimite = Integer.parseInt(scan.nextLine());
		
		for(int i = 2; i*i<=numLimite; i++) {
			numCheck.add(i); //faz um array com todos os numeros menores que a raiz quadrada do numero limite
		}
		
		for(int i=0; i<numCheck.size(); i++) {
		
			for(int j=0; j<numCheck.size(); j++) {
				if(numCheck.get(j)%numCheck.get(i)==0 && numCheck.get(j)!=numCheck.get(i))
					numCheck.remove(j); //remove todos os outros numeros que sao multiplos de outros numeros anteriores
			}
			
		}
		
		for(int i = 2; i<=numLimite; i++) {
			
			for(int j=0; j<numCheck.size() && isPrimo!=false; j++) {
				if(i%numCheck.get(j)==0 && i!=numCheck.get(j)) {
					isPrimo=false;
					
				}
			}
			
			if(isPrimo==true) {
				numPrimo=i;
			}
			isPrimo=true;
			//divide os numeros pela o array gerado anteriormente e caso ele não seja divisivel por nenhum deles, o numero sera primo
		}

		System.out.println("O maior numero primo menor que o inserido acima eh: " + numPrimo);
	
		scan.close();
	}

}
