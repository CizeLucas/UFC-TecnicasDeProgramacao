package Questao17;

import java.util.Scanner;

public class JogoDaVelha {

	private int grid[][];
	private Scanner scan;
	
	public JogoDaVelha() {
		grid = new int[3][3];
		scan = new Scanner(System.in);
	}
	
	public int startGame() {
		int coordinates[] = new int[2];
		//i = coordenadas[0]
		//j = coordenadas[1]
		do {
			for(int player=1; player<3 && !this.isFinalGame(); player++) {
				do {
					System.out.printf("Jogador %d, sua vez: ", player);
					coordinates = this.coordinatesInput(scan.nextLine());
					if(!this.isPlayerMoveValid(coordinates[0], coordinates[1]))
						System.out.println("Coordenadas nao validas (1 a 3) ou ja ocupadas por outro jogador!");
				} while(!this.isPlayerMoveValid(coordinates[0], coordinates[1]));
				
				this.updateGridWithPlayerMove(player, coordinates[0], coordinates[1]);
				this.printGrid();
			}
		}while(!this.isFinalGame());
		
		if(this.isFinalGame()) {
			if(this.isFinalGame(1))
				return 1;
			else
				return 2;
		} else {
			return 0;
		}
	}
	
	public int[] coordinatesInput(String coordenadasStr) {
		int coord[] = new int[2];
		coord[0] = Character.getNumericValue(coordenadasStr.charAt(0))-1;
		coord[1] = Character.getNumericValue(coordenadasStr.charAt(1))-1;
		return coord;
	}
	
	public boolean isPlayerMoveValid(int i, int j) {
		if((i>-1 && i<3) && (j>-1 && j<3)) {
			if(grid[i][j]==0) {
				return true;
			}
		} 
		return false;
	}
	
	public void updateGridWithPlayerMove(int player, int i, int j) {
			grid[i][j]=player;
	}
	
	public boolean isFinalGame(int player) {
		
		boolean lineWin = true;
		boolean columnWin = true;
		boolean diagonal1Win = true;
		boolean diagonal2Win = true;

		//checagem de linha (fixando i)
		for(int j=0; j<3 && (lineWin == false || j==0); j++) {
			lineWin = true;
			for(int i=0; i<3; i++) {
				if(grid[i][j]!=player) {
					lineWin = false;
				}
			}
		}
		
		//checagem de coluna (fixando j)
		for(int i=0; i<3 && (columnWin == false || i==0); i++) {
			columnWin = true;
			for(int j=0; j<3; j++) {
				if(grid[i][j]!=player) {
					columnWin = false;
				}
			}
		}
		
		//checagem de diagonal (incrementando i e j em 1)
		for(int s=0; s<3; s++) { //Diagonal "\"
			if(grid[0+s][0+s]!=player) {
				diagonal1Win = false;
			}
		}
		
		for(int s=0; s<3; s++) {//Diagonal "/"
			if(grid[0+s][2-s]!=player) {
				diagonal2Win = false;
			}
		}
		
		return (lineWin || columnWin || diagonal1Win || diagonal2Win);
	}
	
	public boolean isFinalGame() {
		boolean gameTie = true;
		
		//checa se houve empate no jogo
		for(int j=0; j<3; j++)
			for(int i=0; i<3; i++) 
				if(grid[i][j]==0) 
					gameTie=false;
		
		return (this.isFinalGame(1) || this.isFinalGame(2) || gameTie);
	}
	
	public void printGrid() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d ", grid[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public int getGridCell(int i, int j) {
		return grid[i][j];
	}
		
}
