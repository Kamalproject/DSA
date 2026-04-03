import java.util.Scanner;
public class Swapnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        
        //Here I swap two number without third variable
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Afetr swapping numbers are "+num1+ " "+num2);
    }
}
