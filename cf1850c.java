import java.util.Scanner;

public class cf1850c {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      String s = "";
      for (int i = 0; i < 8; i++) {
        int n = -1;
        String inp = sc.next();
        if (n == -1) {
          for (int j = 0; j < 8; j++) {
            if (inp.charAt(j) != '.') {
              s += inp.charAt(j);
              n = j;
            }
          }
        } else {
          if (inp.charAt(n) != '.') {
            s += s.charAt(n);
          }
        }
      }
      System.out.println(s);
    }
  }
}
