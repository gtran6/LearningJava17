import jdk.jshell.Snippet;

import java.util.Scanner;

public class Function {

    public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;
        //System.out.println("total meal price is: " + result);
    }
    public static void announceTeaTime() {
        System.out.println("waiting for tea time...");
        System.out.println("type in random word and press Enter");
        Scanner input = new Scanner( System.in );
        input.next();
        System.out.println("it's tea time");
    }
    public static void main(String[] args) {
        //announceTeaTime();
        //calculateTotalMealPrice( 15.5, 0.2, 0.15 );
        double totalCost = calculateTotalMealPrice( 15.5, 0.2, 0.15 );
        System.out.println(totalCost);
    }
}
