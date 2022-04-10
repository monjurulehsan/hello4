package hello4;

import java.util.Scanner;

public class HW2 {

//	Scanner

	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);
		System.out.println("=====================AB Store=======================");
		System.out.println("================15455 Manchester.RD==============");
		System.out.println("================Ellisville Mo 66610==============");
		System.out.println("====================1234567891===============");
		System.out.println();
		System.out.println("Mango unit price");
		int mangoprice = ab.nextInt();
		System.out.println("Mango Quantity");
		int mangoquantity = ab.nextInt();
		System.out.println("Total Mango price :" + mangoprice * mangoquantity);

		System.out.println();

		System.out.println("Milk unit price");
		int milkprice = ab.nextInt();
		System.out.println("Milk Quantity");
		int milkquantity = ab.nextInt();
		System.out.println("Total Milk price :" + milkprice * milkquantity);

		System.out.println("Sugar packet unit price");
		int sugarprice = ab.nextInt();
		System.out.println(" Sugar packet Quantity");
		int sugarquantity = ab.nextInt();
		System.out.println("Total Sugar packet price :" + sugarprice * sugarquantity);

		double taxrate = 0.15;
		System.out.println("Tax rate :" + taxrate);
		System.out.println("Tolal product price :"
				+ (mangoprice * mangoquantity + milkprice * milkquantity + sugarprice * sugarquantity));

		double Totalpriceaftertax = (mangoprice * mangoquantity + milkprice * milkquantity + sugarprice * sugarquantity)
				+ (mangoprice * mangoquantity + milkprice * milkquantity + sugarprice * sugarquantity) * taxrate;
		System.out.println("Total price after tax :" + Totalpriceaftertax);

	}

}
