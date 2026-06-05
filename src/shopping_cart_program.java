import java.util.Scanner;
public class shopping_cart_program {
    public static void main(String [] arg){
        Scanner scanner= new Scanner(System.in);

        String iteam;
        double price;
        int quantity;
        char currency= '$' ;
        double total;

        System.out.print("Enter the name of the ITEAM:  ");
        iteam = scanner.nextLine();

        System.out.print("Enter the PRICE:  ");
        price = scanner.nextDouble();

        System.out.print("Enter the QUANTITY of the item:  ");
        quantity = scanner.nextInt();

        System.out.println("-----------------------------------------------------------------");
        total = price * quantity;
        System.out.println("Total Price: "+ currency + total);
        System.out.println("-----------------------------------------------------------------");

        scanner.close();

    }
}
