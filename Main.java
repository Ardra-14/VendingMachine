import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the item number you want to purchase: ");
        System.out.println("1 for Coke");
        System.out.println("2 for Pepsi");
        System.out.println("3 for Soda");

        int itemNumber = scanner.nextInt();
        int Cprice = 40;
        int Pprice = 40;
        int Sprice = 50;
        AmountCalculation ac = new AmountCalculation();

        switch (itemNumber) {
            case 1:
                System.out.println("You have selected Coke - Rs." + Cprice );
                ac.process(Cprice);
                break;
            case 2:
                System.out.println("You have selected Pepsi - Rs." + Pprice);
                ac.process(Pprice);
                break;
            case 3:
                System.out.println("You have selected Soda - Rs." + Sprice);
                ac.process(Sprice);
                break;
            default:
                System.out.println("Invalid selection. Enter a valid number");

        }

    }
}
