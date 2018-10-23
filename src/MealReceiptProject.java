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
		double tax = 0.06 * subTotal;
		System.out.println("The subtotal is " + subTotal);
		System.out.println("The tax is " + tax);
		System.out.print("What percentage would you like to tip?");
		String tipString = keyboard.nextLine();
		double Tip = Double.parseDouble(tipString);
		double tipTotal = subTotal * Tip;
		System.out.println("The tip is"+ Tip);
		double Total = tipTotal + subTotal + tax;
		System.out.println("The total is " + Total);
		System.out.println("\n\n\nItem\t\t\t" + "Price\n" + appetizerStr + "\t\t\t" + appetizerPrice2 + "\n" + entreeStr + "\t\t\t" + entreePrice2 + "\n" + dessertStr + "\t\t\t" + dessertPrice2 + "\n" + "Subtotal\t\t\t" + subTotal + "\n" + "Tax\t\t\t" + tax + "\n" + "Tip\t\t\t" + tipTotal + "\n" + "Total\t\t\t" + Total);
		
	
		
	}

}
