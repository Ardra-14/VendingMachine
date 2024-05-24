import java.util.Scanner;
public class AmountCalculation {
    public void process(int price){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Quantity you desire: ");
        int quantity = s.nextInt();
        int amount = price * quantity;
        System.out.println("Total amount due: Rs. "+amount);
    }
}
