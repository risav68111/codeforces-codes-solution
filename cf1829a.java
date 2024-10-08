import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            String s= sc.next();
            String cf= "codeforces";
            int c=0;
            for(int i=0; i<cf.length(); i++) {
                c+=(s.charAt(i)!=cf.charAt(i)? 1:0);
            }
            System.out.println(c); 
        }
    }
}