import java.util.*;

public class cf581a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r[]= {sc.nextInt(),sc.nextInt()};
        String s= "";
        Arrays.sort(r);
        int c=r[1]-r[0];
        s+=Integer.toString(r[0])+" "+Integer.toString(c/2);
        System.out.println(s);
    }
}