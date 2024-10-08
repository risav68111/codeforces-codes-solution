import java.util.Scanner;

class cf1997a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
         while(t-->0) {
            String s= sc.next();
            if(s.length()==1) {
                if(s.charAt(0)=='a') {
                    System.out.println("wa");
                } else {
                    System.out.println("a"+ s);
                } 
            } else {
                for(int i=0; i<s.length()-1; i++) {
                    if(s.charAt(i)== s.charAt(i+1)) {
                        String temp= "";
                        if (s.charAt(i)=='a') {
                            temp= s.substring(0, i+1)+ "b"+ s.substring(i, s.length());
                        } else 
                        {
                            temp= s.substring(0, i)+ "a"+ s.substring(i, s.length());
                        }
                        System.out.println(temp);
                        break;
                    }
                }
            }
         }
    } 
}