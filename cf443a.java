import java.util.Scanner;

public class cf443a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[{, }]","");
        System.out.println(s.chars().distinct().count());
    }
}
