import java.util.Scanner;
import java.util.Arrays;

public class cf1669b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t--> 0) {
            int n= sc.nextInt();
            int[] arr=  new int[n];
            for(int i=0; i< n; i++) {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int num= -1;
            for(int i=0; i<n-2; i++) {
                if(arr[i]== arr[i+2]) {
                    num= arr[i];
                }
            }
            System.out.println(num);
        }
    }
}