
package src.findTheWumpus;
import java.util.Random;

/**
 * https://stackoverflow.com/questions/11859534/how-to-calculate-the-total-time-it-takes-for-multiple-threads-to-finish-executin
 * 
 * @author Joshua Ciffer, Brian Williams
 * @version 01/02/2018
 */
public class FindTheWumpus {
	// Thanks for getting ur shit done bud.

	// made dem variables
	boolean foundWeapon = false;
	int torchesFound = 0;
	boolean compassFound = false;
	GameTile[][] board = new GameTile[10][10];
	static Random randoms = new Random();

	// also made the methods, but didn't fill it in
	public static void main(String[] args) {
		
//		menu();
//		endTurn();
	}

	public static GameTile[][] makeBoard(int numRows, int numCols, int numTorches) {
		GameTile[][] newBoard = new GameTile[numRows][numCols];
		boolean wumpusPlaced = false, weaponPlaced = false, playerPlaced = false, compassPlaced = false;
		int torchesPlaced = 0;
		for (int row = 0 ; row < newBoard.length ; row++) {
			for (int col = 0 ; col < newBoard[row].length ; col++) {
				newBoard[row][col] = new GameTile();
				do {
					switch (randoms.nextInt(7) + 1) {
						case 1: { // Generates Wumpus
							if (wumpusPlaced) {
								continue;
							} else {
								newBoard[row][col].wumpusHere = true;
								wumpusPlaced = true;
								break;
							}
						}
						case 2: { // Generates Weapon
							if (weaponPlaced) {
								continue;
							} else {
								newBoard[row][col].weaponHere = true;
								weaponPlaced = true;
								break;
							}
						}
						case 3: { // Generates Player
							if (playerPlaced) {
								continue;
							} else {
								newBoard[row][col].playerHere = true;
								playerPlaced = true;
								break;
							}
						}
						case 4: { // Generates Torch
							if (torchesPlaced == numTorches) {
								continue;
							} else {
								newBoard[row][col].torchHere = true;
								torchesPlaced++;
								break;
							}
						}
						case 5: { // Generates Compass
							if (compassPlaced) {
								continue;
							} else {
								newBoard[row][col].compassHere = true;
								compassPlaced = true;
								break;
							}
						}
					}
					break;
				} while (true);
			}
		}
		return newBoard;
	}

	public static void menu() {
		// fill in the blank
	}

	public static void endTurn() {
		// fill in the blank
	}

	// methods the menu will call
	public static void displayBoard() {
		// fill in the blank
	}

	public static void move() {
		// fill in the blank
	}

	public static void useCompass() {
		// fill in the blank
	}

	public static void attacWumpus() {
		// fill in the blank
	}
}
