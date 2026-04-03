import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        
        //Here I swap two number using third variable
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swap numbers are "+num1+ " "+num2);
    }
}
