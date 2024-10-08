import java.util.Scanner;

public class cf935a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), count = 0;
    if (n < 2) {
      System.out.println(1);
    } else {
      for (int i = 1; i < n; i++) {

        if ((n - i) % i == 0) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
