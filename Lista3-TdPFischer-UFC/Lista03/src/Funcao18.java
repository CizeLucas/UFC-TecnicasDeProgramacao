import java.util.Scanner;

public class Funcao18 {

	public static double pow(double base, int expoent) {	
		if(expoent>1)
			base = base * pow(base, expoent-1);
		return base;
	}

	public static double CompoundInterest(double moneyAmount, double rate, int time) {
		return moneyAmount*pow((1+rate), time);
	}
	
	public static void main(String[] args) {
		Scanner sacaner = new Scanner(System.in);
		
		System.out.print("Insira a quantia inicial de dinheiro: ");
		double initialMoney = Double.parseDouble(sacaner.nextLine());
		
		System.out.print("Insira a % de juros em que o dinheiro ficou exposto: ");
		double rate = Double.parseDouble(sacaner.nextLine());
		
		System.out.print("Insira a quantidade de tempo em que o dinheiro ficou exposto: ");
		int time = Integer.parseInt(sacaner.nextLine());

		System.out.printf("\nNessas condicoes, ao final do periodo,\n%.2f R$ serao convertidos em: %.2f R$",initialMoney, CompoundInterest(initialMoney, rate, time));

		sacaner.close();
	}

}
