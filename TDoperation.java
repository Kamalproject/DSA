import java.util.Scanner;
class TwoDarray{
    TwoDarray(){
        Scanner sc=new Scanner(System.in);       
        
        System.out.print("Enter Column: ");
        int col=sc.nextInt();
        int arr[][]=new int[2][col];
        for(int i=0;i<2;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter the element for index "+i+","+j+": ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }      
    }
}
public class TDoperation {
    public static void main(String[] args) {
        TwoDarray td=new TwoDarray();
    }
}
