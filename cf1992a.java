import java.util.Scanner;
import java.util.Arrays;
public class cf1992a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0 ) {
            int[] arr={sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            int inc= 5;
            while(inc-->0) {
                if(arr[0]<=arr[1] && arr[0]<= arr[2]) {
                    arr[0]= arr[0]+1;
                } else if(arr[1]<=arr[0] && arr[1]<=arr[2]) {
                    arr[1]= arr[1]+1;
                } else {
                    arr[2]= arr[2]+1;
                }
                Arrays.sort(arr);
            }
            System.out.println(arr[0]*arr[1]*arr[2]);
        }
    }
}