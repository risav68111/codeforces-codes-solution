import java.util.Scanner;

public class cf1399b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int[] a= new int[n];
            int[] b= new int[n];
            int am= Integer.MAX_VALUE;
            int bm= Integer.MAX_VALUE;
            for(int i=0; i<n; i++) {
                a[i]= sc.nextInt();
                if(a[i]<am) {
                    am= a[i];
                }
            }
            for(int i=0; i<n; i++) {
                b[i]= sc.nextInt();
                if(b[i]<bm) {
                    bm= b[i];
                }
            }
            long ans= 0;
            for(int i=0; i<n; i++) {
                // ans+=Math.max((a[i]-am), (b[i]-bm));
                int ai= a[i]-am;
                int bi= b[i]-bm;
                if(ai>bi) {
                    ans+= ai; 
                } else {
                    ans+= bi;
                }
            }
            System.out.println(ans);
        }
    }
}