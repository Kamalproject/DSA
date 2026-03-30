import java.util.Scanner;
public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=5;
        int number[]={1,3,4,5};
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        int totalsum=n*(n+1)/2;
        int missingnum=totalsum-sum;
        System.out.println("Missing number is "+missingnum);
    }
}
