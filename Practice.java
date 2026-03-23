import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print 1 to n
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
