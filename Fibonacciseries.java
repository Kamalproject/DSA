import java.util.Scanner;
public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int numb=sc.nextInt();
        int a=0,b=1,c;
        System.out.print("Fibonacci series of number"+numb+ " is ");
        for(int i=0;i<=numb;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            
        }
        System.out.println("");
    }
}
