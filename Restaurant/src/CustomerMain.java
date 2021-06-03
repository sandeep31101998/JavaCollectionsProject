import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<RestaurantItems> arraylist = new ArrayList<RestaurantItems>();

		String res = null;

		do {
			System.out.println("Enter the item name: ");
			String itemName = sc.next();

			System.out.println("Enter the item price");
			int itemPrice = sc.nextInt();

			RestaurantItems ri = new RestaurantItems(itemName, itemPrice);

			boolean rs = arraylist.add(ri);

			if (rs) {
				System.out.println("Item successfully added");
			} else {
				System.out.println("Failed to add");
			}

			System.out.println("Do you have more items to add? (Yes/No)");
			res = sc.next();

		} while (res.equalsIgnoreCase("yes"));

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("The Restaurant Menu ");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(i + " " + arraylist.get(i));
		}

		ArrayList<RestaurantItems> arraylist1 = new ArrayList<RestaurantItems>();

		String res1 = null;

		do {

			System.out.println("Enter item number to order the items");
			int ItemNo = sc.nextInt();

			Object obj = arraylist.get(ItemNo);
			boolean rs1 = arraylist1.add((RestaurantItems) obj);
			if (rs1) {
				System.out.println("Item :" + arraylist.get(ItemNo) + " added successfully");
			} else {
				System.out.println("Failed to add items");
			}
			System.out.println("Do you wish to order some more items? (Yes/No)");
			res1 = sc.next();
		} while (res1.equalsIgnoreCase("yes"));

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("The Ordered Items are");
		for (int i = 0; i < arraylist1.size(); i++) {
			System.out.println(i + " " + arraylist1.get(i));
		}
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("The total billing details are");
		double totalPrice = 0;
		for(int i=0;i<arraylist1.size();i++)
		{
			RestaurantItems rt = arraylist1.get(i);
			totalPrice+=rt.itemPrice;
		}
		
		System.out.println("The Ordered Items are");
		for (int i = 0; i < arraylist1.size(); i++) {
			System.out.println(i + " " + arraylist1.get(i));
		}
		
		System.out.println("Total amount to pay is: "+totalPrice);

	}

}
