import java.util.Scanner;

public class cf2013a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0) {
            int n= sc.nextInt(), x= sc.nextInt(), y= sc.nextInt();
            int c= Math.min(x,y);
            System.out.println((n+c-1)/c);

        }
    }
}