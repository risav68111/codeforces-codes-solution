import java.util.Scanner;

public class cf266a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nos= sc.nextInt();
        String s= sc.next();
        int count=0;
        for(int i=0, j=1; i<nos-1 && j<nos; i++, j++) {
            if(s.charAt(i)==s.charAt(j)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
