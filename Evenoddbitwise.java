import java.util.Scanner;
public class Evenoddbitwise {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int bitmask=1;
        if(num==0){
            System.out.println(num+" is neither even nor odd");
        }
        else if((num & bitmask)==0){
            System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
        
    }
}
