import java.util.Scanner;
public class Clearbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter the Position: ");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int notbitmask=~(bitmask);
        int newnumber=notbitmask & n;
        
        System.out.println("After clearing the bit new number is "+newnumber);
    }
}
