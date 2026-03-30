import java.util.Scanner;
public class Missingnumber {
    public static void main(String[] args) {
        int number[]={1,3,4,5};
        int n=5;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans^=i;
            
        }
        
        for(int i=0;i<number.length;i++){
            ans =ans^number[i];
        }
        System.out.println(ans);
    }
}
