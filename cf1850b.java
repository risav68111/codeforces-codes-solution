import java.util.Scanner;

public class cf1850b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt(),ans=0, lim=0, count=0;
            while(count<n) {
                int a=sc.nextInt(), b= sc.nextInt();
                
                count++;
                if(a<11 && lim<= b) {
                    lim=b;
                    ans= count;
                } 
            }
            System.out.println(ans);
        }
    }
}