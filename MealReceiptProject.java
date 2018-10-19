import java.util.Scanner;

public class MealReceiptProject 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the name of your appetizer: ");
		String appetizerStr = keyboard.nextLine();
		System.out.print("Please enter the price for the appetizer: ");
		String appetizerPrice = keyboard.nextLine();
		double appetizerPrice2 = Double.parseDouble(appetizerPrice);
		System.out.print("Please enter the name of your entree: ");
		String entreeStr = keyboard.nextLine();
		System.out.print("Please enter the price for the entree: ");
		String entreePrice = keyboard.nextLine();
		double entreePrice2 = Double.parseDouble(entreePrice);
		System.out.print("Please enter the name of your dessert: ");
		String dessertStr = keyboard.nextLine();
		System.out.print("Please enter the price for the dessert: ");
		String dessertPrice = keyboard.nextLine();
		double dessertPrice2 = Double.parseDouble(dessertPrice);
		double subTotal = appetizerPrice2 + entreePrice2 + dessertPrice2;
		System.out.println("The subtotal is " + subTotal);
		System.out.println("What percentage would you like to tip?");
		String taxString = keyboard.nextLine();
		double tax = Double.parseDouble(taxString);
		double taxTotal = subTotal * tax;
		System.out.print("The tax is " + taxTotal);
		double Total = taxTotal + subTotal;
		System.out.println("The total is " + Total);
		
	
		
	}

}
