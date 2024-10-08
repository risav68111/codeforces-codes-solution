import java.util.Scanner;

public class cf1807a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0) {
            System.out.println((sc.nextInt()-sc.nextInt())==sc.nextInt()? "-":"+");
        }
    }
}
