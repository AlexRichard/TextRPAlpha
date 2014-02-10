package DungeonRoomOne; //Package

import java.util.Scanner;

public class Main { //Main Class

	public static void main (String[] args) { //Set Main As Main Class
		
		System.out.printf("\nX----------------------------------------------------X\n");
		System.out.printf(  "|             o SOME TEXT RPG TEST THING o           |\n");
		System.out.printf(  "X----------------------------------------------------X\n");
		
		Scanner userInput = new Scanner (System.in); //Create New Scanner Input
		
		System.out.printf("\n > Enter your name adventurer: ");
		CharacterInfo.charName = userInput.next( );  //Find out What The User Does
		
		Room1 Room1Object = new Room1(); //Create Room1 Object
		Room1Object.Room1(); //Access Room1 Class

		
	} //Close Method
	
} //Close Class
