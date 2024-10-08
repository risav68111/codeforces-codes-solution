import java.util.Scanner;

public class cf2019a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0) {
            int n= sc.nextInt();
            int[] arr= new int[n];
            int a=0, m= Integer.MIN_VALUE;
            for(int i=0; i<n; i++) {
                arr[i]= sc.nextInt();
                int prev= i/2;
                int nxt= (n-1-i)/2;
                m= Math.max(m, arr[i]+prev+ nxt);
            }
            System.out.println(m+1);
        }
    }
}