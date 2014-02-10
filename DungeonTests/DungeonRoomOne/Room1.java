package DungeonRoomOne; //Package

import java.util.Scanner; //Import Scanner Utility

public class Room1 //Room1 Class
{
	public static boolean torchlit;
	
	public void Room1() //Create Room1 Method
	{ 
		torchlit = false;
		
		Scanner userInput = new Scanner (System.in); //Create New Scanner Input

		LightTorch lightTorch = new LightTorch(); //Create lightTorch Object
		SearchBookShelves searchShelves = new SearchBookShelves(); //Create searchcShelves Object
		Statistics skills = new Statistics();
		
		LightTorch.wet = true; //Set LightTorch wet Variable
	
		
		String userAction; //Create userAction String
		boolean litRoom;
		boolean nextRoom;
		
		litRoom = true;
		nextRoom = false;
		
		do {
			System.out.printf("\n > You wake up in a small dark room, there is very little light. You can feel the cold stone floor and walls. What do you do next?");
				System.out.printf("\n\n A) Light a torch.");
				System.out.printf("\n B) Feel around some more.");  //Room Description Stuff
				System.out.printf("\n C) Leave.");
	
					System.out.printf("\n\n Action: "); //Prompt Action
					userAction = userInput.next( );  //Find out What The User Does
		
					if (userAction.equals("A")) {  //If They Light Their Torch
						lightTorch.LightTorch(); //Access LightTorch Class
					} // Close Light Torch
		
					 if (userAction.equals("B")) { //If They Choose To Feel Around
						System.out.printf("\n > You trip and fall on your face,  you get up slightly dazed.\n"); //Make Them Fall Over Lol
					} //Close Feel Around
		
					if (userAction.equals("C")) { //If They Choose To "Try" To Leave
						System.out.printf("\n > As you head for the exit, metal bars slide over the opening. As you step away they open again.\n"); //Block Them From leaving Lololol
					} //Close Leave
					
					if (userAction.equals("Skills")) { //If They Choose To Look At Skills
						skills.Statistics(); // Show Skills
					} //Close Skills
					
		} while (torchlit == false);
			
			if (torchlit == true) { //See If Torch is Lit, If So, Light Room
				litRoom = true;
				System.out.printf("\n > The room is suddenly alight with an orange glow, in the room you can now see a bookshelf, and a door directly in front of you heading north. What do you do next?");
				System.out.printf("\n\n A) Go through the north door.");
				System.out.printf("\n B) Look through bookshelves.");  //Room Description Stuff
				System.out.printf("\n C) Leave.");
				
					System.out.printf("\n\n Action: "); //Prompt Action
					userAction = userInput.next( );  //Find out What The User Does
					
					if (userAction.equals("A")) { //If They Go Through Door
						System.out.printf("\n > This isn't implemented yet!\n"); //GOTO NEXT ROO
					} //Close Look Through Book Shelves
					
					if (userAction.equals("B")) { //If They look Through Book Shelves
						searchShelves.SearchBookShelves(); //Access SearchBookShelves Class
					} //Close Look Through Book Shelves
					
					if (userAction.equals("C")) { //If They Choose To "Try" To Leave
						System.out.printf("\n > As you head for the exit, metal bars slide over the opening. As you step away they open again.\n"); //Block Them From leaving Lololol
					} //Close Leave
				
					if (userAction.equals("Skills")) { //If They Choose To Look At Skills
						skills.Statistics(); // Show Skills
					} //Close Skills
					
				} // Close Torch Lit
			
		do {
			System.out.printf("\n > You are in a small lit room, the room is lit only by your torch, theres a small bookshelf and a door headed north. What do you do next?");
			System.out.printf("\n\n A) Go through north door.");
			System.out.printf("\n B) Look through bookshelves.");  //Room Description Stuff
			System.out.printf("\n C) Leave.");

				System.out.printf("\n\n Action: "); //Prompt Action
				userAction = userInput.next( );  //Find out What The User Does
				
				if (userAction.equals("A")) { //If They Go Through Door
					System.out.printf("\n > This isn't implemented yet!\n"); //GOTO NEXT ROOM
				} //Close Look Through Book Shelves
				
				if (userAction.equals("B")) { //If They look Through Book Shelves
					searchShelves.SearchBookShelves(); //Access SearchBookShelves Class
				} //Close Look Through Book Shelves
				
				if (userAction.equals("C")) { //If They Choose To "Try" To Leave
					System.out.printf("\n > As you head for the exit, metal bars slide over the opening. As you step away they open again.\n"); //Block Them From leaving Lololol
				} //Close Leave
				
				if (userAction.equals("Skills")) { //If They Choose To Look At Skills
					skills.Statistics(); // Show Skills
				} //Close Skills
				
		} while (nextRoom == false);
					
	} //Close Method
} //Close Class
