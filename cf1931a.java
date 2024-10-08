import java.util.Scanner;

public class cf1931a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            int x= sc.nextInt()-2;
            int a=1;
            int b=1;
            while(x>26) {
                b+=1;
                x-=1;
                if(b>26) {
                    b-=1;
                    a+=1;
                }
            }
            System.out.println((char)(a+96)+""+(char)(b+96)+""+ (char)(x+96));
        }
    }
}
