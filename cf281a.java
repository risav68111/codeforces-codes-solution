import java.util.Scanner;

public class cf281a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String ini= s.substring(0,1);
        ini= ini.toUpperCase();
        System.out.println(ini+s.substring(1, s.length()));
    }
}
