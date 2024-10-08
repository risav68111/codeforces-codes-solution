import java.util.Scanner;

public class cf1283a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= (24-sc.nextInt())*60 - sc.nextInt();
            System.out.println(n);
        }
    }
}