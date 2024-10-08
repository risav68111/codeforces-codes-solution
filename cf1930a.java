import java.util.Scanner;

public class cf1930a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int y= sc.nextInt();
        while(y-->0) {
            int t=sc.nextInt();
            int sum= 0;
            while(t-->0) {
                sum+=Math.min(sc.nextInt(), sc.nextInt());
            }
            System.out.println(sum);
        }
    }
}
