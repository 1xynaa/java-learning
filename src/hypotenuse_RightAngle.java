import java.util.Scanner;
public class hypotenuse_RightAngle{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //Hypotenuse c= Math.sqrt(a²+b²)

        double a;
        double b;
        double c;
        String unit = "cm" ;

        System.out.print("Enter the length of side A:  ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B:  ");
        b= scanner.nextDouble();

        c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The Hypotenuse of the Right Angled Triangle =  "+ c + unit);

        scanner.close();

    }


}
