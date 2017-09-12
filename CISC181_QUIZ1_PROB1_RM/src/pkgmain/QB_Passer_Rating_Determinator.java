package pkgmain;

import java.util.Scanner;

public class QB_Passer_Rating_Determinator {
	
	public static void main(String[] args) {
	
		
		double touchdowns; 
		double TotalYards;
		double PassesAttempted;
		double PassesCompleted;
		double interceptions;
		
		double a;
		double b;
		double c;
		double d;
		
		double PasserRating;
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter number of touchdowns: ");
		touchdowns = input1.nextDouble();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter number of total yards: ");
		TotalYards = input2.nextDouble();
		
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter number of passes attempted: ");
		PassesAttempted = input3.nextDouble();
		
		Scanner input4 = new Scanner(System.in);
		System.out.print("Enter number of passes completed: ");
		PassesCompleted = input4.nextDouble();
		
		Scanner input5 = new Scanner(System.in);
		System.out.print("Enter number of interceptions: ");
		interceptions = input5.nextDouble();
		
		a = ((PassesCompleted / (double) PassesAttempted) - 0.3) * 5.0;
		b = ((TotalYards / (double) PassesAttempted) - 3) * .25;
		c = (touchdowns / (double) PassesAttempted) * 20.0;
		d = 2.375 - ((interceptions / (double) PassesAttempted) * 25.0);
		
		
		if ((a + b + c + d) < (4 * 2.375)) {
		PasserRating = ((a + b + c + d) / 6.0) * 100.0;
		System.out.printf("The QB's passer rating is: %.1f", PasserRating);
		}
		else if ((a + b + c + d) >= (4 * 2.375))  {
		PasserRating = 158.3;
		System.out.printf("The QB's passer rating is: %.1f", PasserRating);
		}
		else {
		System.out.print("Something went wrong");
		}
	
	}

}
