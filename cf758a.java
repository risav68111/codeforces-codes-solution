import java.util.Scanner;
import java.util.Arrays;

public class cf758a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int count=0;
        int[] ar= new int[n];
        while(i<n) {
            ar[i]= sc.nextInt();
            i++;
        }
        Arrays.sort(ar);
        for(int ii=0; ii<n-1; ii++) {
            count+=ar[n-1]-ar[ii];
        }
        System.out.println(count);
    }
}
