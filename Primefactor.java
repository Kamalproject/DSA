import java.util.Scanner;
public class Primefactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int count=1;
        System.out.print("Prime factor of "+number +" = ");
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }            
        }
        System.out.println();
    }
}
