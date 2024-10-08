import java.util.Scanner;
import java.util.Arrays;

public class cf1741a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            int arr[]= {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            if (arr[2]== arr[0]+arr[1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}