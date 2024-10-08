import java.util.Scanner;
import java.util.Arrays;

public class cf1760a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            int [] ar= {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(ar);
            System.out.println(ar[1]);
        }
    }
}
