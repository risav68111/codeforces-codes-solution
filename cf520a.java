import java.util.Scanner;

public class cf520a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        String s= sc.next();
        int count =0;
        for(char l='a'; l<='z'; l++) {
            if(s.toLowerCase().contains(String.valueOf(l))) {
                count++;
            }                
        }
        System.out.println(count==26? "YES":"NO");
    }
}
