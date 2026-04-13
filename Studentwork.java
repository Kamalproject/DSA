import java.util.Scanner;
class Student{
    String name;
    int roll;
    int mark_1;
    int mark_2;
    int mark_3;
    
    Student(String n,int r,int mark_1,int mark_2,int mark_3){
        name=n;
        roll=r;
        this.mark_1=mark_1;
        this.mark_2=mark_2;
        this.mark_3=mark_3;
        
        
    }
    void Display(){
        System.out.println("Name is "+name);
        System.out.println("Roll is "+roll);
        System.out.println("Mark_1 "+mark_1);
        System.out.println("Mark_2 "+mark_2);
        System.out.println("Mark_3 "+mark_3);
        int total=mark_1+mark_2+mark_3;
        double percentage=((double)total/300)*100;
        System.out.println("Percentage is "+percentage);
    }
}
public class Studentwork{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your roll: ");
        int roll=sc.nextInt();
        System.out.print("Enter mark: ");
        int mark_1=sc.nextInt();
        System.out.print("Enter mark_2 ");
        int mark_2=sc.nextInt();
        System.out.print("Enter mark_3 ");
        int mark_3=sc.nextInt();
        
        Student su=new Student(name,roll,mark_1,mark_2,mark_3);
        su.Display();
        
    }
}
