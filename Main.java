import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the item number you want to purchase: ");
        System.out.println("1 for Coke");
        System.out.println("2 for Pepsi");
        System.out.println("3 for Soda");

        int itemNumber = scanner.nextInt();
        int itemPrice = 50;

        switch (itemNumber) {
            case 1:
                System.out.println("You have selected Coke - Rs." + itemPrice);
                break;
            case 2:
                System.out.println("You have selected Pepsi - Rs." + itemPrice);
                break;
            case 3:
                System.out.println("You have selected Soda - Rs." + itemPrice);
                break;
            default:
                System.out.println("Invalid selection. Enter a valid number");
                return;
        }

        System.out.println("Enter the quantity you desire: ");
        int quantity = scanner.nextInt();
        int amount = itemPrice * quantity;
        System.out.println("Total amount due: Rs. " + amount);
    }
}
