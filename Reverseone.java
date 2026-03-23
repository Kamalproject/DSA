import java.util.Scanner;
public class Reverseone {
    //Using Recursion print the number from n to 1;
    public static void printNum(int num){
        if(num==0){
            return;
        }
        else{
            System.out.print(num+" ");
            printNum(num-1);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print 1 to n
        System.out.println("Enter number: ");
        int n=sc.nextByte();
        printNum(n);
        System.out.println();
        
    }
}
