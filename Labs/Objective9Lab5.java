import java.util.Scanner;

public class Objective9Lab5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

		System.out.println("Please give me a number: ");
		num1 = kb.nextDouble();


		System.out.println("Please give me another number: ");
		num2 = kb.nextDouble();

		while (keepGoing){
			printMenu();
			System.out.println("What would you like to do?");
			choice = kb.nextInt();

			swtich(choice){
			case 1: 
				System.out.println("1. Add Numbers");
				break;
			case 2:
				System.out.println("2. Find Average");
				break;
			case 3:
				System.oit.println("3. Calculate Tax");
				break;
			case 4:
				System.out.println("4. Exit");
				break;

			default:
				System.out.println("Invalid entry. Please try again.");
				break;
			}
		}

			kb.close();

	}
}