import java.util.Scanner;

public class GeometryCalculator
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("\n\n\nHello " + name + ", welcome to the Geometry Calculator!" + "\nPress enter to continue...");
		keyboard.nextLine();
		
		System.out.println("\n\n\nAREA OF A TRIANGLE");
		System.out.print("Please enter the length of the base: ");
		String baseStr = keyboard.nextLine();
		double base = Double.parseDouble(baseStr);
		System.out.print("Please enter the length of the height: ");
		String heightStr = keyboard.nextLine();
		double height = Double.parseDouble(heightStr);
		System.out.print("Please enter the unit of measure: ");
		String unit = keyboard.nextLine();
		
		double area = 0.5 * base * height;
		System.out.println("The area of the triangle is " + area + " " + unit + "^2");
		
		System.out.println("\n\n\nVolume of a Rectangular Prism");
		System.out.println("Please press enter to continue");
		System.out.print("Please enter the length: ");
		String lengthStr = keyboard.nextLine();
		double length = Double.parseDouble(lengthStr);
		System.out.print("Please enter the height: ");
		String height2Str = keyboard.nextLine();
		double height2 = Double.parseDouble(height2Str);
		System.out.print("Please enter the width: ");
		String widthStr = keyboard.nextLine();
		double width = Double.parseDouble(widthStr);
		System.out.print("Please enter the unit of measure: ");
		String unit2 = keyboard.nextLine();
		
		double volume = length * width * height2;
		System.out.println("The volume of the rectangular prism is " + volume + " " + unit2 + "^3");
		
		
		
	}

}
;