import java.util.Scanner;
import java.util.Arrays; 

public class cf723a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        System.out.println(arr[2]-arr[0]);
    }
}