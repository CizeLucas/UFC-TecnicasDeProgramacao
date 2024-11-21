import java.util.Scanner;

public class Funcao15 {

	public static boolean CheckPalindrome(String word) {
		
		for(int i=0; i<word.length(); i++) {
				if(word.charAt(i) != word.charAt(word.length()-i-1)) 
					return false;
		}

		return true;		
	}
	
	// anilina  a n i l i n a
	//			0 1 2 3 4 5 6
				
	// esse     e s s e
	// 			0 1 2 3

	//oco 		o c o
	// 			0 1 2
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma palavra: ");
		String inputText = scan.nextLine();

		if(CheckPalindrome(inputText)) {
			System.out.printf("A palavra %s eh palindroma!", inputText.toString());
		} else {
			System.out.printf("A palavra %s NAO eh palindroma!", inputText.toString());
		}
		
		scan.close();
	}

}
