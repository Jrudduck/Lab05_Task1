import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userPrice;
        double shippingCost = 1.02;
        double userFinal;
        System.out.println("Enter the price of your item.");
       if(scan.hasNextDouble()) {
           userPrice = scan.nextDouble();
           if (userPrice < 100) {
               userFinal = userPrice * shippingCost;
               System.out.println("Your total cost including shipping is " + userFinal + ".");
           }else  {
                   System.out.println("Your total cost with free shipping is " + userPrice + ".");
               }


       }
        else {
           System.out.println("Incorrect value");
           System.exit(0);
       }

    }
}