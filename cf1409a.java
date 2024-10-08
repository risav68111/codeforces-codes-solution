import java.util.Scanner;

public class cf1409a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int x=0;
            if((a-b)>0) {
                x=a-b;
            } else {
                x=b-a;
            }
            if(x%10==0) {
                System.out.println(x/10);
            } else {
                x/=10;
                x++;
                System.out.println(x);
            }
        }
    }
}