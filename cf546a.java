import java.util.Scanner;

public class cf546a {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int k= cs.nextInt(), n=cs.nextInt(), w= cs.nextInt();
        int dol= ((w*w+w)/2)*k;
        // if(dol>n) {
        //     System.out.println(dol-n);
        // } else {
        //     System.out.println(0);
        // }
        System.out.println(dol>n ? (dol-n) : 0);
    }
}
