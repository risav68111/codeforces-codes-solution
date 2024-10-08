import java.util.Scanner;

public class cf1951a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            String s= sc.next();
            int c=0;
            for(int i=0; i<n; i++) {
                if(s.charAt(i)=='1') {
                    c++;
                }
            }
            boolean b=false;
            for(int i=0; i<n-1; i++) {
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1') 
                {
                    b=true;
                }
            }
            if(c%2==1 || (c%2==0 && b)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}