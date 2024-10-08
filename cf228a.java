import java.util.Scanner;
import java.util.Arrays;

public class cf228a {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       int arr[]= new int[4];
       for(int a=0; a<4; a++) {
            arr[a]= sc.nextInt();
       }
       Arrays.sort(arr);
       int count=0;
       for(int i=0; i<3; i++) {
            if(arr[i]==arr[i+1]) {
                count++;
            }
       }
       System.out.println(count);
    }
}
