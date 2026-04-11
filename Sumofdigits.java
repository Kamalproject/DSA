import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int temp=number;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        System.out.println("Sum of the digit of "+number+" is "+ sum);
        
    }
}
