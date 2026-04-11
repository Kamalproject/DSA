import java.util.Scanner;
public class Aramstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        String txt=String.valueOf(num);
        int len=txt.length();
        while(temp!=0){
            int rem=temp%10;
            sum+=Math.pow(rem,len);
            temp/=10;
        }
        if(sum==num){
            System.out.println("Number "+num+" is Aramstrong");
        }
        else{
            System.out.println("Number "+num+" is not Aramstrong");
        }
    }
}
