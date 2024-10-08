import java.util.ArrayList;
import java.util.Scanner;

public class cf490a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar1= new ArrayList<Integer>(0);
        ArrayList<Integer> ar2= new ArrayList<Integer>(0);
        ArrayList<Integer> ar3= new ArrayList<Integer>(0);
        for (int i=0; i<n; i++) {
            switch (sc.nextInt()) {
                case 1-> ar1.add(i+1);
                case 2-> ar2.add(i+1);
                case 3-> ar3.add(i+1);
            }
        }
        int min= Math.min(ar1.size(), Math.min(ar2.size(), ar3.size()));
        // ar1.size(); 
        // if (ar2.size()<min) {
        //     min =ar2.size();
        // } else if (ar3.size()<min) {
        //     min= ar3.size();
        // }
        System.out.println(min);
        for(int ii=0; ii<min; ii++) {
            System.out.println(ar1.get(ii)+" "+ ar2.get(ii)+" "+ar3.get(ii));
        }
    }
}