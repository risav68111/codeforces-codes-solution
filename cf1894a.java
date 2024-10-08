import java.util.Scanner;

public class cf908a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        while(x-->0) {
            int a=0,b=0,c=0;
            int n= sc.nextInt();
            String s= sc.next();
            while(++c<n) {
                if (s.charAt(c-1)!='B' && s.charAt(c)!=s.charAt(c-1)) {
                        a++;
                } else if(s.charAt(c-1)=='B' && s.charAt(c)!=s.charAt(c-1)){
                    b++;
                } 
            }
            if(a>b) {
                System.out.println('A');
            } else if(b>a) {
                System.out.println('B');
            } else {
                System.out.println('?');
            }
        }
    }
}