import java.util.Scanner;

public class addition {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int x= sc.nextInt();
        System.out.println("enter the first number");
        int y= sc.nextInt();
        sc.close();
        System.out.println("the sum is ");
        int sum=x+y;
        System.out.println(sum);

    }
}
