import java.util.Scanner;
public class Setbit {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Which position data you want: ");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int setbit=num|bitmask;
        System.out.println("Old number is "+num);
        System.out.println("After set the bit the new number is "+setbit);
        
    }
}
