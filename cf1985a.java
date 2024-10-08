import java.util.Scanner;

public class cf1985a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      String a = sc.next();
      String b = sc.next();

      String ans = "";

      ans = b.substring(0, 1) + a.substring(1, 3) + " " + a.substring(0, 1) + b.substring(1, 3);
      System.out.println(ans);
    }
  }
}
