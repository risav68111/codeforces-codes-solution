import java.util.Scanner;
import java.util.Arrays;

public class cf1154a {
    public static void main(String[] args ) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[4];
        for(int i=0; i<4; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        // a+b= arr[0]
        // a+c=arr[1]
        // b+c= arr[2]
        // a+b+c= arr[3]
        // c=arr[3]- arr[0]
        // a=arr[1]- c
        // b= arr[2]-c
        int c= arr[3]- arr[0];
        int b= arr[2]- c;
        int a= arr[1]- c;
        System.out.println(a +" "+b+" "+c);        
    }
}