import java.util.Scanner;
import java.util.Arrays;

public class cf246a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ar_len= sc.nextInt();
        int lim= sc.nextInt();
        int[] arr= new int[ar_len];
        for(int i=0; i<ar_len; i++) arr[i]= sc.nextInt();
        Arrays.sort(arr);
        int count=0;
        int j=0;
        while(arr[2]<lim) {
            count++;
            arr[2]++;
        }
        System.out.println(count);
    }
}
