import java.util.Scanner;

public class cf1976a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      boolean aInt = false, aChar = false;
      int n = sc.nextInt(), min = 0;
      String s = sc.next();
      for (int i = 0; i < n; i++) {
        int tem = (int) s.charAt(i);
        if (min > tem) {
          System.out.println("NO");
        }
        min = tem;
      }
      System.out.println("YES");
    }
  }
}
