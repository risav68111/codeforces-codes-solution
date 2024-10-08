import java.util.Scanner;

public class cf2013b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt(), sum=0;
            int[] arr= new int[n];
            for(int i=0; i<n; i++) {
                arr[i]= sc.nextInt();
                if(i<n-2) {
                    sum= arr[i]+ sum;
                }
            }
            System.out.println(arr[n-1]-(arr[n-2]-sum));
        }
    }
}