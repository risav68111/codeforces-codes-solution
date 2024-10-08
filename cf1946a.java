import java.util.Scanner;
import java.util.Arrays;

public class cf1946a {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int res =0;
            Arrays.sort(a);
            int mi = (n + 1)/2;
            for (int i = mi- 1; i < n; i++) {
                if (a[i] >= a[mi - 1]) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
