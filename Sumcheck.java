import java.util.Scanner;
class Sumcheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("What is your target ");
        int target=sc.nextInt();

        //array element insertion 
        for(int i=0;i<n;i++){
            System.out.println("Enter value for index "+i+" ");
            array[i]=sc.nextInt();
        }

        //Condition check.
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    System.out.println(array[i]+","+array[j]);
                }
            }
        }

        sc.close();   
    }
}