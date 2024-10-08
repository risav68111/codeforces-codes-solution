import java.util.Scanner;

public class cf1433a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int l= n%10-1;
            int sum=l*10;
            sum += (n/1000>0? 10: n/100>0? 6: n/10>0? 3: 1);
            System.out.println(sum);
        }
    }
}