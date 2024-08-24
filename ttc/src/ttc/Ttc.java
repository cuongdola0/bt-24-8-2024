
package ttc;

import java.util.Scanner;


public class Ttc {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt co vsn.");
            } else {
                System.out.println("ptvn.");
            }
        } else {
            double x = -b / a;
            System.out.println("pt x = " + x);
        }
        
        scanner.close();
    }
}

   
