import java.util.LinkedList;
import java.util.Scanner;

public class cf1970a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String ans= "";
        LinkedList<Integer> ll1= new LinkedList<>();
        LinkedList<Integer> ll2= new LinkedList<Integer>();
        int j=s.length()-1;
        for(int i=0; i<s.length(); ) {
            if(s.charAt(i)=='(') {
                ll1.add(i);
            }
            if(s.charAt(j)==')') {
                ll2.add(j);
            }
            i++;
            j--;
        }
        
        System.out.println(ans);
    }
}