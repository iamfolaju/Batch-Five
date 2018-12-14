package payroll;
import java.util.Scanner;

public class Payroll {
    static int total,i, totalCap ,total1, store1, total2, store2, total3,  store3, cap1, cap2, cap3, loss, gain,goodOne,goodTwo,goodThree;
    static String option;
    static Scanner scan = new Scanner(System.in);
    
    public static int storeOne(){    
    store1 = 0;
    total1 = 0;
    for(i = 0; i < goodOne; i++) {
        System.out.println("STORE 1: Enter Amount for Each Goods");
        total1 = scan.nextInt();           
        store1 += total1;    
        }
        System.out.println("The total amnount for STORE 1 is " + store1);
        return store1;
    }
    
    public static int storeTwo(){        
    total2 = 0;
    store2 = 0;
     for(i = 0; i < goodTwo; i++) {
            System.out.println("STORE 2: Enter Amount for Each Goods");
            total2 = scan.nextInt();
            store2 += total2;
        }
        System.out.println("The total amnount for STORE 2 is " + store2);
        return store2;
    }
    
    public static int storeThree(){        
    total3 = 0;
    store3 = 0;
     for(i = 0; i < goodThree; i++) {
            System.out.println("STORE 3: Enter Amount for Each Goods");
            total3 = scan.nextInt();
            store3 += total3;
        }
        System.out.println("The total amnount for STORE 3 is " + store3);
        return store3;
    }
    
    public static void gainOne(){
    gain = ((store1 - cap1) * 100) / cap1;
        System.out.println("You have a gain of " + gain + "% in STORE 1");
    }
    
    public static void gainTwo(){
    gain = ((store2 - cap2) * 100) / cap2;
        System.out.println("You have a gain of " + gain + "% in STORE 2");
    }
    
    public static void gainThree(){
    gain = ((store3 - cap3) * 100) / cap3;
        System.out.println("You have a gain of " + gain + "% in STORE 3");
    }
    public static void gainTotal(){
    gain = ((total - totalCap) * 100) / totalCap;
        System.out.println("You have a gain of " + gain + "% in your STORE");
    }
    
    public static void lossOne(){
    loss = ((cap1 - store1) * 100) / cap1;
        System.out.println("You have a loss of " + loss + "% in STORE 1");
    }
    
    public static void lossTwo(){
    loss = ((cap2 - store2) * 100) / cap2;
        System.out.println("You have a loss of " + loss + "% in STORE 2");
    }
    
    public static void lossThree(){
    loss = ((cap3 - store3) * 100) / cap3;
        System.out.println("You have a loss of " + loss + "% in STORE 3");
    }
    
    public static void lossTotal(){
    gain = ((totalCap - total) * 100) / totalCap;
        System.out.println("You have a gain of " + loss + "% in your STORE");
    }
    
    public static void status(){
        System.out.println("Do You Wish To Know The Status of Your Business?");
        System.out.println("1 for YES");
        System.out.println("2 for NO");
        int ption = scan.nextInt();
        
        switch(ption){
            case 1:
            System.out.println("Oh! you chose YES");
            System.out.println("Input the capital for STORE 1 below: ");
            cap1 = scan.nextInt();
            System.out.println("Input the capital for STORE 2 below: ");
            cap2 = scan.nextInt();
            System.out.println("Input the capital for STORE 3 below: ");
            cap3 = scan.nextInt();
            totalCap = cap1 + cap2 + cap3;
            
            if(cap1 < store1){
                gainOne();
            }
            else if(cap1 > store1){
                lossOne();
            }
            if(cap2 < store2){
                gainTwo();
            }
            else if(cap2 > store2){
                lossTwo();
            }
            if(cap3 < store3){
                gainThree();
            }
            else if(cap3 > store3){
                lossThree();
            }
            if(totalCap < total){
                gainTotal();
            }
            else if(totalCap > total){
                lossTotal();
            }
            else{
                if(cap1 == store1){
                    System.out.println("You have a perfect sale in STORE 1");
                }
                if(cap2 == store2){
                    System.out.println("You have a perfect sale in STORE 1");
                }
                if(cap3 == store3){
                    System.out.println("You have a perfect sale in STORE 1");
                }
                if(total == (cap1 + cap2 + cap3)){
                    System.out.println("You have a perfect sale in your STORE");
                }
            }
        break;
        case 2:
            System.out.println("Oh! you chose NO");
            System.out.println("Thanks!");
        break;
        }
    }
    
    public static void main(String[] args) {
       System.out.println("Input your name below: ");
       String name = scan.nextLine();
       System.out.println("Goodday " + name);
       System.out.println("How many goods was sold in STORE 1");
       goodOne = scan.nextInt();
       System.out.println("How many goods was sold in STORE 2");
       goodTwo = scan.nextInt();
       System.out.println("How many goods was sold in STORE 3");
       goodThree = scan.nextInt();
       storeOne();
       storeTwo();
       storeThree();
       total  = store1 + store2 + store3;
       System.out.println("The total payroll of your stores is " +  total);
       status();
    }
}
    

