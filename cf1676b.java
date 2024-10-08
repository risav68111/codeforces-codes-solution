import java.util.Scanner;
import java.util.Arrays;


public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int[] arrayCandy= new int[n];
            for(int i=0; i<n; i++) {
                arrayCandy[i]= sc.nextInt();
            }
            Arrays.sort(arrayCandy);
            int count=0;
            while(n-->1) {
                count+=(arrayCandy[n]-arrayCandy[0]);
            }
            System.out.println(count);
        }
    }
}