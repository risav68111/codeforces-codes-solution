import java.util.Arrays;
import java.util.Scanner;

public class cf1934a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int sum=0;
            int arr[]= new int[n];
            for(int i=0; i<n; i++) {
                arr[i]= sc.nextInt();
            }
            for(int i=0; i<n-1; i++) {
                for(int j=i+1; j<n; j++) {
                    sum+=Math.abs(arr[i]-arr[j]);
                }
            }
            System.out.println(sum);
        }
    }
}