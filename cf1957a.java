import java.util.Scanner;
import java.util.Arrays;
public class cf1957a {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int[] ar= new int[n];
            for(int i=0; i<n; i++) {
                ar[i]= sc.nextInt(); 
            }
            if(n<3) {
                System.out.println(0);
            } else {
                Arrays.sort(ar);
                int c=0;
                int ini=ar[0];
                int co= 1;
                for(int i=1; i<n; i++) {
                    if(ar[i]==ini) {
                        c++;
                    } else {
                        co+= c/3;
                        c=1;
                        ini= ar[i];
                    }
                }
                System.out.println(co);
            }
        }
    }
}