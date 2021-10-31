import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {

		int CarsFromTheNorth, CarsFromTheSouth, CarsFromTheWest, CarsFromTheEast;
		String Car = "*";
		String RoadBorder1 = "|   |", RoadBorder2 = "_";
		String CrossWalk = "---";

		// First project I'm starting
		// With input of cars, i want them to be able to move through an imaginary
		// 4-way.

		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many cars are coming from the North? ");
		CarsFromTheNorth = keyboard.nextInt();
		if (CarsFromTheNorth > 5 || CarsFromTheNorth <= 0) {
			System.out.println("Ethier too many or not enough cars!");
			System.exit(0);
		}

		System.out.print("South? ");
		CarsFromTheSouth = keyboard.nextInt();
		if (CarsFromTheSouth > 5 || CarsFromTheSouth <= 0) {
			System.out.println("Ethier too many or not enough cars!");
			System.exit(0);
		}

		System.out.print("East? ");
		CarsFromTheEast = keyboard.nextInt();
		if (CarsFromTheEast > 5 || CarsFromTheEast <= 0) {
			System.out.println("Ethier too many or not enough cars!");
			System.exit(0);
		}

		System.out.print("West? ");
		CarsFromTheWest = keyboard.nextInt();
		if (CarsFromTheWest > 5 || CarsFromTheEast <= 0) {
			System.out.println("Ethier too many or not enough cars!");
			System.exit(0);
		}
		
		//Print out a traffic 4-way
		//Prints out the top to bottom road.
		for (int j = 0; j < 5; j++) {
			System.out.printf(" ");
			for (int i = 0; i < 5; i++) {
				System.out.println(RoadBorder1);
			}
			}
		}
		
	}
