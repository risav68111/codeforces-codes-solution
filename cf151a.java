import java.util.Scanner;
import java.util.Arrays;

public class cf151a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] ar= new int[8];
        for(int i=0; i<8; i++) {
            ar[i]= sc.nextInt();
        }
        int[] arr= {((ar[1]*ar[2])/ar[6])/ar[0], (ar[3]*ar[4])/ar[0], (ar[5]/ar[7])/ar[0]};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}