import java.util.Scanner;

public class cf2009a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int a=sc.nextInt(), b= sc.nextInt();
            System.out.println(b-a);
        }
    }
}