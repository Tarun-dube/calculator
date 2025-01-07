import java.util.Scanner;

public class subtract {
    
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the first number");
        int x= sc.nextInt();
        System.out.println("enter the first number");
        int y= sc.nextInt();
        sc.close();
        int diff=x-y;
        System.out.println(diff);

    }
}
