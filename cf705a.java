import java.util.Scanner;

public class cf705a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String str= "I hate ";
        int bn= 1;
        while(--n>0) {
            str+= "that ";
            if(bn==1) {
                str+="I love ";
                bn=0;
            } else {
                str+="I hate ";
                bn=1;
            }
        }
        System.out.println(str+" it");
    }
}
