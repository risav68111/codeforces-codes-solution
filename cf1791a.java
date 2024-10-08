import java.util.Scanner;
j
public class cf1791a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt(), x=0, y=0;
            String s= sc.next(), ans="NO";
            for(int i=0; i<n; i++) {
                char c= s.charAt(i);
                switch(c) {
                    case 'L' -> x--;
                    case 'R' -> x++;
                    case 'U' -> y++;
                    case 'D' -> y--;
                }
                if(x==1 && y==1) {
                    ans= "YES";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}