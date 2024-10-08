import java.util.Scanner;

public class cf431a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        String s= sc.next();
        int sum=0;
        for(int i=0; i<s.length(); i++) {
            sum+=arr[(int)(s.charAt(i)-49)];
        }
        System.out.println(sum);
    }
}
