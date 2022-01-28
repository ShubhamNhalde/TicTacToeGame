package com.bridgelabz.TicTacToeGame;

import java.util.Scanner;

public class UC2_SelectInput {

	public static final Scanner SC = new Scanner(System.in);
	public static char[] inputs = new char[2];
	public static final int USER = 1;
	public static final int COMPUTER = 2;	
	
	public static void main(String[] args) {
		selectInput();
		
	}
	private static char[] selectInput() {
		System.out.println("Choose X or O :");
		char choice = SC.next().charAt(0);
		char userInput = ' ';
		char computerInput = ' ';
		if (choice == 'X' || choice == 'O') {
			userInput = choice == 'X' ? 'X' : 'O';
			computerInput = userInput == 'X' ? 'O' : 'X';
		} else {
			System.out.println("Invalid input chosen");
		}
		System.out.println("Player Input: " + userInput + " | Computer Input: " + computerInput);
		char[] inputs = { userInput, computerInput };
		return inputs;
	}

}

