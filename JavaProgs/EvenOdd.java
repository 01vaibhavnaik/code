import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter num:");
        num= sc.nextInt();
 
        if(num%2==0){
            System.out.println("num is even");

        }else{
            System.out.println("num is odd");
        }
        

    }
    
}
