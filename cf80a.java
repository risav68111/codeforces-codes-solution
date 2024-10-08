import java.util.Scanner;

public class cf80a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int s= sc.nextInt();
        int np= 0;
        if(isPrime(s)) {
            for(int i=n+1; i<50; i++) {
                np= isPrime(i)? i:0;
                if(np>0) {
                    break;
                }
            }
        }
        System.out.println(s==np? "YES": "NO");
    }
    public static boolean isPrime(int n) {
        boolean b= true;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                b= false;
                break;
            }
        }
        return b;
    }
}