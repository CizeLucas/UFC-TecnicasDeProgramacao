import java.util.Scanner;

public class Funcao17 {

	public static void InvertString(char str[]) {
		char temp;
		
		for(int i=0; i<str.length/2; i++) {
			temp = str[i];
			str[i] = str[(str.length-i-1)];
			str[(str.length-i-1)] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a string a ser invertida: ");
		String strInput = scan.nextLine();
		char charString[] = strInput.toCharArray();
		
		System.out.print("\nA string "+ strInput +" invertida eh: ");
		InvertString(charString);
		System.out.print(charString);

		scan.close();
	}

}
