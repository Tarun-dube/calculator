import java.util.Scanner;

public class division {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int x= sc.nextInt();
        System.out.println("enter the first number");
        int y= sc.nextInt();
        sc.close();
        int div=x/y;
        System.out.println(div);

    }
}
