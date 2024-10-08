import java.util.Scanner;

public class cf266b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no= sc.nextInt();
        int t= sc.nextInt();
        String s= sc.next();
        char[] c= s.toCharArray();
        while(t-->0) {
            for(int i=0; i<s.length()-1; i++) {
                if(c[i]=='B' && c[i+1]=='G') {
                    c[i]='G';
                    c[i+1]='B';
                    i++;
                }
            }
        }
        String ss=new String(c);
        System.out.println(ss);
    }
}