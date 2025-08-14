public double subTotal;
public static double runningTotal;
private static double itemPrice;
static boolean ordering = true;
static Scanner input = new Scanner(System.in);

public static void menu() {
	System.out.println("-------------------------------");
	System.out.println("------VENDING MACHINE UUM------");
	System.out.println("-------------------------------");
	System.out.println();
		System.out.println("Welcome \n1. Nabati (Rm2.00) \n2. Kitkat (RM3.00) \n3. Maggi (Rm2.00) \n4. Mineral Water (RM1.00) \n5. Coffee Latte (RM3.00) \n6. White Coffee (RM3.00");
	System.out.print("Please choose product");
}
	public static double itemPrice(int foodItem) {
		if (foodItem == 1) {
			System.out.println("NABATI");
			itemPrice = 2.00;
		}
    if (foodItem == 2) {
			System.out.println("KITKAT");
			itemPrice = 3.00;
		}
		if (foodItem == 3) {
			System.out.println("MAGGI");
			itemPrice = 2.00;
		}
		if (foodItem == 4) {
			System.out.println("MINERAL WATER");
			itemPrice = 1.00;
		}
		if (foodItem == 5) {
			System.out.println("COFFEE LATTE");
			itemPrice = 2.00;
		}
		if (foodItem == 6) {
			System.out.println("WHITE COFFEE");
			itemPrice = 2.00;
		}

		return itemPrice;

public static double Quantity() {
	System.out.println("Enter quantity");
	double quantity = input.nextDouble();
	return quantity;
}

public static void main(String[] args) {
	int menuOption;
	int foodItem = 0;
	input = new Scanner(System.in);
	do {
			double runningTotal = 0;
			menu();
			menuOption = input.nextInt();
			switch (menuOption) {
				case 1:
					foodItem = 1;
					itemPrice(foodItem);
					break;
				case 2:
					foodItem = 2;
					itemPrice(foodItem);
					break;
				case 3:
					foodItem = 3;
					itemPrice(foodItem);
					break;
				case 4:
					foodItem = 4;
					itemPrice(foodItem);
					break;
				case 5:
					foodItem = 5;
					itemPrice(foodItem);
					break;
				case 6:
					foodItem = 6;
					itemPrice(foodItem);
					break;
				defaut:
					System.out.println("Invalid option.Please try again.");
					continue;

	double subTotal = Quantity() * itemPrice;
	System.out.println("Total is : " + "RM " + subTotal);
	System.out.print("Please enter payment : RM")
		double payment = input.nextDouble();
					if (subTotal - payment < 0.00f) {
						System.out.println("Thankyou, your balance are : RM" + (payment - subTotal));
						System.out.println("Enjoy your meal"):
					}
					else if (subTotal - payment > 0.00f) }
						System.out.println("Insufficient payment of : RM" + subTotal - payment) + ". Please insert the amount needed. ");
						double amount = input.nextDouble();
						System.out.println("Enjoy your meal.")l
						continue;
					}
					else
						System.out.println("Enjoy your meal.");
					} while (ordering);

					{
					}
	}
}
