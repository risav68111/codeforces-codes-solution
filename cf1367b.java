import java.util.Scanner;

public class cf1367b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int c0= 0;
            int c1= 0;
            int c= 0;
            for(int i=0; i<n; i++) {
                int v=sc.nextInt();
                if(v%2!=i%2 && v%2==0) {
                    c0++;
                } else if(v%2!=i%2 && v%2==1) {
                    c1++;
                } else {
                    c++;
                }
            }
            // System.out.println(c0+" "+ c1);
            if(c0-c1==0) {
                System.out.println(c0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
