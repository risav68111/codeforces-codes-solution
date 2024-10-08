import java.util.Scanner;
import java.util.Arrays;

public class mcf1399a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        while(l-->0) {
            int[] ar= new int[sc.nextInt()];
            for(int i=0; i<ar.length; i++) {
                ar[i]= sc.nextInt();
            }
            Arrays.sort(ar);
            int cou=0;
            for(int i=0; i<ar.length-1; i++) {
                if ((ar[i+1]- ar[i])>1) {
                    cou++;
                    break;
                }
            }
            System.out.println(cou>0 ? "NO" : "YES");
        }
    }
}