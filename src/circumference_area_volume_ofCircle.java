import java.util.Scanner;
public class circumference_area_volume_ofCircle {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        double radius;
        double area;
        double circumference;
        double volume;

        System.out.print("Enter the radius of the Circle:  ");
        radius= scanner.nextDouble();

        circumference= 2 * radius * Math.PI;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0)* Math.PI * Math.pow(radius,3);

        System.out.printf("Circumference of the circle= %.1f cm " , circumference);
        System.out.println();
        System.out.printf("Area of the circle = %.1f cm²" , area );
        System.out.println();
        System.out.printf("Volume of the circle = %.1f cm³" , volume );
        System.out.println();


        scanner.close();
    }
}
