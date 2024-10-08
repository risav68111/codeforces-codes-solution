import java.util.Scanner;

public class cf236a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        Long cou= s.chars().distinct().count();
        System.out.println(cou%2==0 ? "CHAT WITH HER!": "IGNORE HIM!");
    }
}
