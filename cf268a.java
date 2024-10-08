import java.io.*;
import java.util.Scanner;

public class cf268a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int to= sc.nextInt();
        int[] ar1= new int[to];
        int[] ar2= new int[to];
        for(int i=0; i<to; i++) {
            ar1[i]= sc.nextInt();
            ar2[i]= sc.nextInt();
        }
        int gu=0;
        for(int i=0; i<to; i++) {
            for(int j=0; j<to; j++) {
                if (ar1[i]==ar2[j]) {
                    gu++;
                }
            }
        }
        System.out.println(gu);
    }
}
