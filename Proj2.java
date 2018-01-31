/*******************************************************************
* Proj2.java
* <Alex Masson / Section B/ Thursday 4:30 - 6:30>
*
* This program lets the user buy a ticket plan for the Big 12 tourney
*******************************************************************/
import java.util.*;// Add import line here to use the Scanner class

public class Proj2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);// Declare a Scanner object here to be used for input
		double selection = 0;
		double ticketSelection1 = 0;
		String input;
		String parkingPassSelection;
		double PARKINGPASSADDON = 25;
		double total1 = 0;
		double TICKETPRICE = 80;
		double parkingPass1 = 0;
		double alumniDiscount = .1;
		double militaryDiscount = .2;
		double facultyDiscount = .15;
		double ticketPriceDiscount = 0;

		System.out.println("** Welcome to the Big 12 Men's Basketball Tournament App **");
 		System.out.println("    March 7-10, 2018 at the Sprint Center in Kansas City   ");
		System.out.println("       -----Show your Purple Pride!-----                   ");

		System.out.println(" ");
		System.out.println("Please select from the following categories:");
		System.out.println("1) Student");
		System.out.println("2) Alumni");
		System.out.println("3) Faculty & Staff");
		System.out.println("4) Military");
		System.out.println("5) General Public");
		System.out.println(" ");

		System.out.print("Selection: ");
		input = in.nextLine();
		selection = Double.parseDouble(input);
		System.out.println(" ");


		if (selection == 1){
      System.out.print("Please enter the number of tickets you would like to purchase: ");
			input = in.nextLine();
			ticketSelection1 = Double.parseDouble(input);
			System.out.println(" ");
			System.out.println("Would you like to purchase a parking pass for the game?");
			System.out.print("Select Y or N: ");
			parkingPassSelection = in.nextLine();
				if (parkingPassSelection.equals("Y") || parkingPassSelection.equals("y")){
					parkingPass1 += PARKINGPASSADDON;
					total1 = (ticketSelection1*(TICKETPRICE/2)) + parkingPass1;
					System.out.printf("You ordered %d tickets with parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else if (parkingPassSelection.equals("N") || parkingPassSelection.equals("n")) {
					total1 = ticketSelection1*(TICKETPRICE/2);
					System.out.printf("You ordered %d tickets without parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else {
					System.out.println("Invalid selection. Exiting Program. Please re-run.");
					System.exit(0);
				}


		} else if (selection == 2){
			System.out.print("Please enter the number of tickets you would like to purchase: ");
			input = in.nextLine();
			ticketSelection1 = Double.parseDouble(input);
			System.out.println(" ");
			System.out.println("Would you like to purchase a parking pass for the game?");
			System.out.print("Select Y or N: ");
			parkingPassSelection = in.nextLine();
				if (parkingPassSelection.equals("Y") || parkingPassSelection.equals("y")){
					parkingPass1 += PARKINGPASSADDON;
					ticketPriceDiscount = TICKETPRICE * alumniDiscount;
					TICKETPRICE -= ticketPriceDiscount;
					total1 = (ticketSelection1*TICKETPRICE) + parkingPass1;
					System.out.printf("You ordered %d tickets with parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else if (parkingPassSelection.equals("N") || parkingPassSelection.equals("n")) {
					ticketPriceDiscount = TICKETPRICE * alumniDiscount;
					TICKETPRICE -= ticketPriceDiscount;
					total1 = ticketSelection1*(TICKETPRICE);
					System.out.printf("You ordered %d tickets without parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else {
					System.out.println("Invalid selection. Exiting Program. Please re-run.");
					System.exit(0);
				}

		}	else if (selection == 3){
			System.out.print("Please enter the number of tickets you would like to purchase: ");
			input = in.nextLine();
			ticketSelection1 = Double.parseDouble(input);
			System.out.println(" ");
			System.out.println("Would you like to purchase a parking pass for the game?");
			System.out.print("Select Y or N: ");
			parkingPassSelection = in.nextLine();
				if (parkingPassSelection.equals("Y") || parkingPassSelection.equals("y")){
					parkingPass1 += PARKINGPASSADDON;
					ticketPriceDiscount = TICKETPRICE * facultyDiscount;
					TICKETPRICE -= ticketPriceDiscount;
					total1 = (ticketSelection1*(TICKETPRICE)) + parkingPass1;
					System.out.printf("You ordered %d tickets with parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else if (parkingPassSelection.equals("N") || parkingPassSelection.equals("n")) {
					ticketPriceDiscount = TICKETPRICE * facultyDiscount;
					TICKETPRICE -= ticketPriceDiscount;
					total1 = ticketSelection1*(TICKETPRICE);
					System.out.printf("You ordered %d tickets without parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else {
					System.out.println("Invalid selection. Exiting Program. Please re-run.");
					System.exit(0);
				}
		} else if (selection == 4){
			System.out.print("Please enter the number of tickets you would like to purchase: ");
			input = in.nextLine();
			ticketSelection1 = Double.parseDouble(input);
			System.out.println(" ");
			System.out.println("Would you like to purchase a parking pass for the game?");
			System.out.print("Select Y or N: ");
			parkingPassSelection = in.nextLine();
				if (parkingPassSelection.equals("Y") || parkingPassSelection.equals("y")){
					parkingPass1 += PARKINGPASSADDON;
					ticketPriceDiscount = TICKETPRICE * militaryDiscount;
					TICKETPRICE -= ticketPriceDiscount;
					total1 = (ticketSelection1*(TICKETPRICE)) + parkingPass1;
					System.out.printf("You ordered %d tickets with parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else if (parkingPassSelection.equals("N") || parkingPassSelection.equals("n")) {
					ticketPriceDiscount = TICKETPRICE * militaryDiscount;
					TICKETPRICE -= ticketPriceDiscount;
					total1 = ticketSelection1*(TICKETPRICE);
					System.out.printf("You ordered %d tickets without parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
					System.out.println(" ");
					System.out.println("Enjoy the game and Go Wildcats!");
				} else {
					System.out.println("Invalid selection. Exiting Program. Please re-run.");
					System.exit(0);
				}
		} else if (selection == 5){
			System.out.print("Please enter the number of tickets you would like to purchase: ");
				input = in.nextLine();
				ticketSelection1 = Double.parseDouble(input);
			System.out.println(" ");
			System.out.println("Would you like to purchase a parking pass for the game?");
			System.out.print("Select Y or N: ");
				parkingPassSelection = in.nextLine();
					if (parkingPassSelection.equals("Y") || parkingPassSelection.equals("y")){
							parkingPass1 += PARKINGPASSADDON;
							total1 = (ticketSelection1*(TICKETPRICE)) + parkingPass1;
						System.out.printf("You ordered %d tickets with parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
						System.out.println(" ");
						System.out.println("Enjoy the game and Go Wildcats!");
				} else if (parkingPassSelection.equals("N") || parkingPassSelection.equals("n")) {
							total1 = ticketSelection1*(TICKETPRICE);
							System.out.printf("You ordered %d tickets without parking for a total cost of: $%.2f\n",(int)ticketSelection1, total1);
							System.out.println(" ");
							System.out.println("Enjoy the game and Go Wildcats!");
				} else {
							System.out.println("Invalid selection. Exiting Program. Please re-run.");
							System.exit(0);
				}

		}else{
			System.out.println("Invalid selection. Exiting Program. Please re-run.");
			System.exit(0);
		}//end if else

  	in.close();//close the scanner
	} // end main
} // end class Lab1
