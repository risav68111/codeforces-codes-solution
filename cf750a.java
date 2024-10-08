import java.util.Scanner;

public class cf750a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int a=1;
        while(k<240) {
            k+=a*5;
            if(k>240) {
                System.out.println(a-1);
                return;
            } else if(a>=n) {
                System.out.println(n);
                return;
            }
            a++;
        }
        System.out.println(a-1);
    }
}

