import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            String s= sc.next();
            char[] arr= new char[126];
            int c=0;
            while(n-->0) {
                if(s.charAt(n)!=arr[s.charAt(n)-65]) {
                    arr[s.charAt(n)-65]= s.charAt(n);
                    c+=2;
                } else {
                    c++;
                }
            }
            System.out.println(c);  
        }
    }
}