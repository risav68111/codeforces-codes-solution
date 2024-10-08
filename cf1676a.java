import java.util.Scanner;

public class cf1676a {
    public static int ans(int i) {
        int ann= 0;
        while(i>0) {
            ann+=i%10;
            i=i/10;
        }
        return ann;
    }
    public static void main(String[] args ) {
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        while(c-->0) {
            int con= sc.nextInt();
            int a= con/1000;
            int b= con%1000;
            if (ans(a)== ans(b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
