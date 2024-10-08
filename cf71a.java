import java.util.Scanner;

public class cf71a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        sc.nextLine();

        while(0<i--) {
            String st= sc.nextLine();
            if(st.length()<10) {
                System.out.println(st);
                
            } else {
                int end= (st.length()-1);
                String mid= Integer.toString(end-1);
                char ini= st.charAt(0);
                char fin= st.charAt(end);
                String str= ini+mid+fin;
                System.out.println(str);
            }
        }
    }
}
