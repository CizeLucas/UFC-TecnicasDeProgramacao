import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero limite:");
        int numLimit = Integer.parseInt(scan.nextLine());
        
        for (int numA=0; numA<=numLimit; numA++)
            for (int numB=0; numB<=numLimit; numB++)
                System.out.printf("%d - %d\n", numA, numB);
        
        scan.close();
     }
}