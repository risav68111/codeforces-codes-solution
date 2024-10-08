import java.util.Scanner;

public class cf732a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int pr= sc.nextInt();
        int ch= sc.nextInt();
        int i=0;
        while(++i>0) {
            if(pr*i%10==0 || pr*i%10==ch) {
                System.out.println(i);
                return;
            }
        }
    }
}