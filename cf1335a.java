import java.util.Scanner;

public class cf1335a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        while(a-->0) {
            int i=sc.nextInt();
            if (i<3) {
                System.out.println(0);
            } else if(i%2==0) {
                System.out.println((i/2)-1);
            } else {
                System.out.println((i-1)/2);
            }
        }
    }
}
