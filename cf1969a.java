import java.util.Scanner;

public class cf1969a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int[] ar= new int[n];
            for(int i= 0; i<n; i++) {
                ar[i]= sc.nextInt();
            } 
            for(int i=0; i<n; i++) {
                int li=ar[ar[i]];
                if(li == i+1) {
                    break;
                }
            }
        }
    }
}
