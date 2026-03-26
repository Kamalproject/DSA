import java.util.Scanner;
public class Getbit {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Which position data you want: ");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if((num & bitmask)!=0){
            System.out.println("in index "+pos+" data is one");
        }
        else{
            System.out.println("in index "+pos+" data is zero");
        }
        
    }
}
