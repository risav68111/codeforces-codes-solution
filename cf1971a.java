import java.util.Scanner;

public class cf1971a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int x= sc.nextInt(), y= sc.nextInt();
            System.out.println(x>y ? y +" "+ x : x +" "+ y);
        }
    }
}