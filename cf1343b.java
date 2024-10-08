import java.util.Scanner;

public class cf1343b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w= sc.nextInt();
        while(w-->0) {
            int n= sc.nextInt();
            if (n%4!=0) {
                System.out.println("NO");
            } else {
                int sum=0;
                int sum1=0;
                System.out.println("YES");
                for(int i=1; i<n/2+1; i++) {
                    System.out.print((i*2)+" ");
                    sum1+=(i*2);
                }
                for(int j=1; j<n-2; j+=2) {
                    System.out.print(j+" ");
                    sum+=j;
                }
                System.out.println(sum1-sum);
            }
        }
    }
}
