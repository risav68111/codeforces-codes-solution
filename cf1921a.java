import java.util.Scanner;

public class cf1921a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int x1=sc.nextInt(), y1= sc.nextInt();
            int x2= sc.nextInt(), y2= sc.nextInt();
            int x3= sc.nextInt(), y3= sc.nextInt();
            int x4= sc.nextInt(), y4= sc.nextInt();
            int a= 0;
            if(x1==x2) {
                a= y1-y2;
            } else if(x1==x3) {
                a= y1- y3;
            } else {
                a= y1-y4;
            }
            System.out.println(a*a);
        }
    }
}