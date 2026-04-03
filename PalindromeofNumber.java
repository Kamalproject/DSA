import java.util.Scanner;
public class PalindromeofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int reverse=0;
        while(temp!=0){
            int rem=temp%10;
            reverse=reverse*10+rem;
            temp/=10;
        }
        if(num==reverse){
            System.out.println(num+ " is Palindrome");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
    }
}
