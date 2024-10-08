import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first  = scanner.nextLine().split(" ");
        
        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);
        int t = Integer.parseInt(first[2]); 
        
        int res = n*k*t/100;
        int full = res/k;
        int left = res%k;
        
        int[]resArr = new int[n];

        for(int i=0; i<n; i++){
            resArr[i] = i<full ? k : (i==full ? left : 0);
        }
        System.out.println(String.join(" ", Arrays.stream(resArr).mapToObj(String::valueOf).toArray(String[]::new)));
    }
}