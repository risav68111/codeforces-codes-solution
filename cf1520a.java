import java.util.Scanner;

public class cf1520a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0) {
            sc.nextInt();
            String s= sc.next();
            int n=0;
            char c= s.charAt(0);
            for(int i=n; i<n; i++) {
                if(s.charAt(i)==c) {
                    continue;
                } else {
                    n=i;
                    break;
                }
            }
        }
    }
}