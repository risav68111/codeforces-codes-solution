import java.util.Scanner;

public class cf136a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        int[] arr= new int[i];
        for(int n=0; n<i; n++) {
            arr[sc.nextInt()-1]= n+1;
        }
        for(int x:arr) {
            System.out.println(x);
        }
    }
}
