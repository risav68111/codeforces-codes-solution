import java.util.Scanner;
import java.util.Arrays;

public class cf339a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        String s= sc.nextLine();
        String[] str= s.split("\\+");
        Arrays.sort(str);
        System.out.println(String.join("+", str));
    }
}
