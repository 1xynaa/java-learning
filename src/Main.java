
import java.util.Scanner;
public class Main{
    public static void main(String []arg){
        Scanner scanner =new Scanner(System.in);
        //area of rectangle

        double width =0;
        double length =0;

        double area=0;


        System.out.println("Enter width");
        width = scanner.nextDouble();

        System.out.println("Enter length: ");
        length= scanner.nextDouble();

        area= width*length;

        System.out.println( "Area = "+area);
        area= width*length;

        scanner.close();

    }
}
