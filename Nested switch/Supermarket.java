package nested_switch;

import java.util.*;
public class Supermarket {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int product, quantity, category;
		String name=" ";
		int total=0, price=0;
		char choice;
		
		do {
			System.out.println("Supermarket");
			System.out.println("1.Fruits");
			System.out.println("2.Vegetables");
			System.out.println("Select Category");
			category=sc.nextInt();
			
			switch(category) {
			case 1:
				System.out.println("1.Apple -Rs.60/kg");
				System.out.println("2.Mango -Rs.100/kg");
				System.out.println("3.Orange -Rs.80/kg");
				System.out.println("Select Product");
				product=sc.nextInt();
				switch(product) {
				case 1:
					name="Apple";
					price=60;
					break;
				case 2:
					name="Mango";
					price=100;
					break;
				case 3:
					name="Orange";
					price=80;
					break;
				default:
					System.out.println("Invalid");
				}
				break;
			case 2:
				System.out.println("1.Tomato -Rs.40/kg");
				System.out.println("2.Onion -Rs.50/kg");
				System.out.println("3.Carrot -Rs.70/kg");
				System.out.println("Select Product");
				product=sc.nextInt();
				switch(product) {
				case 1:
					name="Tomato";
					price=40;
					break;
				case 2:
					name="Onion";
					price=50;
					break;
				case 3:
					name="Carrot";
					price=70;
					break;
				default:
					System.out.println("Invalid");
				}
				break;
			}
			if(!name.equals(" ")) {
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				int amount=price*quantity;
				total=total+amount;
			}
			System.out.println("Do you want to add any other products? y/n:");
			choice=sc.next().charAt(0);
		}while(choice=='Y'||choice=='y');
		System.out.println("Total Amount: "+total);
	}
}
