import java.util.Scanner;
class Arrayop{
    int arr[];
    int size;
    Arrayop(int s){
        size=s;
        arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=0;
        }
    }
    void InputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nInserting Elements to the Array: ");
        for(int i=0;i<size;i++){
            System.out.print("Enter element for index "+i+" ");
            arr[i]=sc.nextInt();
        }
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void SumandAverage(){
        int sum=0;
        double avg=0.0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
            avg=(double)sum/size;
        }
        System.out.println("Sum of the elements are "+sum);
        System.out.println("Average of the elements are "+avg);
    }
    void SwapMaxMin(){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        int temp=min;
        min=max;
        max=temp;
        System.out.println("\nAfter Swaping the number");
        System.out.println("Min number is "+min);
        System.out.println("Max number is "+max);
    }
    void CountOccurence(){
        for(int i=0;i<size;i++){
            int count=1;
            boolean visited=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    visited=true;
                    break;
                }
            }
            if(visited){
                continue;
            }
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+ " occur "+count+" times");
        }
        
    }
}
public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Arrayop ap=new Arrayop(5);
        System.out.println("Default value: ");
        ap.display();
        
        ap.InputArray();
        ap.display();
        ap.SwapMaxMin();
        ap.CountOccurence();
    }
}
