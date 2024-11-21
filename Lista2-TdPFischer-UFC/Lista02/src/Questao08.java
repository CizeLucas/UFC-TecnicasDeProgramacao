import java.util.Scanner;

public class Questao08 {
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	int qttParenteses=0;
	    	int qttColchetes=0;
	    	int qttChaves=0;
	    	boolean expOk = true;
	    	String inputExp;
	    	
	    	System.out.print("Digite a expressao matematica a ser checada: ");
	    	inputExp = scan.nextLine();
	    	
	    	for(int i=0; i<inputExp.length() && expOk==true; i++) {
	
	    		if(inputExp.charAt(i)=='(') {
	    			qttParenteses++;
	    		} else if (inputExp.charAt(i)=='[') {
	    			qttColchetes++;
	    		} else if(inputExp.charAt(i)=='{') {
	    			qttChaves++;
	    		}
	    		
	    		if(inputExp.charAt(i)==')') {
	    			qttParenteses--;
	    		} else if(inputExp.charAt(i)==']') {
	    			qttColchetes--;
	    		} else if(inputExp.charAt(i)=='}') {
	    			qttChaves--;
	    		}
	    		
	    		if(qttParenteses<0 || qttColchetes<0 || qttChaves<0)
	    			expOk=false;	
	    	}

	    	if(qttParenteses==0 && qttColchetes==0 && qttChaves==0) {
	    		System.out.println("A expressao matematica '" + inputExp + "' esta bem formatada!");
	    	} else {
	    		
	    		if(expOk==true) {
	    			System.out.println("'"+inputExp+"' NAO esta bem formatada! (pois algum simbolo nao foi fechado)");
	    		} else {
	    			System.out.println("'"+inputExp+"' NAO esta bem formatada! (pois algum simbolo foi fechado antes de ser aberto e vice-versa)");
	    		}
	    	}
	    	
	    	scan.close();
	    }
}


