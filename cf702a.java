import java.util.Scanner;

public class cf702a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), count = 0, max_count = 0, p = Integer.MAX_VALUE;

    while (n-- > 0) {
      int c = sc.nextInt();
      if (p >= c) {
        count = 1;
      } else {
        count++;
      }
      p = c;
      max_count = max_count < count ? count : max_count;
    }
    System.out.println(max_count);
    sc.close();
  }
}
