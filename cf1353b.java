import java.util.Scanner;
import java.util.Arrays;

public class cf1353b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int l= sc.nextInt();
            int r= sc.nextInt();

            int ar[]= new int[l];
            int ar1[]= new int[l];
            for(int i=0; i<l; i++) {
                ar[i]= sc.nextInt();
            }
            for(int i=0; i<l; i++) {
                ar1[i]= sc.nextInt();
            }
            Arrays.sort(ar);
            Arrays.sort(ar1);
            int sum=0;
            int a=0;
            while(r-->0) {
                ar[a]= ar[a]>ar1[l-1]? ar[a]: ar1[l-1];
                a++;
                l--;
            }
            for(int i=0; i<ar.length; i++) {
                sum+= ar[i];
            }
            System.out.println(sum);
        }
    }
}