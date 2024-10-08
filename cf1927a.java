import java.util.Scanner;

public class cf1927a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int l= sc.nextInt();
            String s= sc.next();
            int i=0;
            int j= l-1;
            for(; i<l; i++) {
                if(s.charAt(i)== 'B') {
                    break;
                } 
            }
            for (; j>-1; j--) {
                if(s.charAt(j)=='B') {
                    break;
                }

            }
            System.out.println(j-i+1);
        }
    }
}