import java.util.Scanner;

public class cf1722a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int x= sc.nextInt();
            char[] c= sc.next().toCharArray();
            if(c.length==5 && con(c, 'T') && con(c, 'i') && con(c, 'm') && con(c, 'u') && con(c, 'r')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean con(char[] c,char t) {
        for(char ch: c) {
            if(ch==t) {
                return true;
            }
        }
        return false;
        } 
}