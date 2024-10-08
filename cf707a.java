import java.util.Scanner;

public class cf707a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt()* sc.nextInt();
        while(t-->0) {
            char c= sc.next().charAt(0);
            if(checkColor(c)) {
                System.out.println("#Color");
                return;
            }
        }
        System.out.println("#Black&White");
    }
    public static boolean checkColor(char ch) {
        char[] c= {'C', 'M', 'Y'};
        for(char i: c) {
            if( ch==i) {
                return true;
            }
        }
        return false;
    }
}