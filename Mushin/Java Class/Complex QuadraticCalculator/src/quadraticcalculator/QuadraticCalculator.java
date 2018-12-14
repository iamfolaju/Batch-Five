package quadraticcalculator;

import java.util.Scanner;

public class QuadraticCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double a, b, c, x1, x2, d, p, d1, d2;
        
        System.out.println("Input the value of a: ");
        a = in.nextDouble();
        
        System.out.println("Input the value of b: ");
        b = in.nextDouble();
        
        System.out.println("Input the value of c: ");
        c = in.nextDouble();
        
        d = (b*b) - (4*a*c);
        
        
        if (a != 0 && d > 0){
        
        
        x1 = (-b + Math.sqrt(d)) / (2*a);
        x2 = (-b - Math.sqrt(d)) / (2*a);
        
        System.out.println("The roots of the quadratic equation are: " + x1 + " and " + x2 + ".");
        }
        else if(d == 0){
             x1 = (-b + Math.sqrt(d)) / (2*a);
            System.out.println("The equation has equal root which is: " + x1);
        }
        else if(d < 0){
             p = -b / (2 * a);
             d1 = Math.sqrt(-d);
             System.out.print("The equation has a complex roots : " + p + " + " + String.format("%.2f", d1) + "i" + "/" + (2*a) );
             System.out.print(" and " + p + " - " + String.format("%.2f", d1) + "i" + "/" + (2*a));
             System.out.println(" ");
        }
        
    }
    
}