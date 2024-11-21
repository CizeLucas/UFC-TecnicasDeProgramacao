import java.util.Scanner;

public class Questao07v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numLimit;
		int num=2;
		int numPrimo=2;
		boolean isPrimo=true;
	    System.out.print("Insira um numero: ");
	    numLimit = Integer.parseInt(scan.nextLine());
	    System.out.println();
	    
	    while(numLimit > num) {
	    	
	    	for(int i=2; i<=numPrimo && isPrimo==true; i++) 
	    		if(num%i==0 && !(num==1 || num==i)) 
	    			isPrimo=false;
	    	
	    	if(isPrimo==true) 
	    		numPrimo=num;
	    	
	    	num++;
	    	isPrimo=true;

	    }
	    
	    System.out.println("O maior numero primo menor que o inserido eh: "+numPrimo);

	}

}
