import java.util.Scanner;

fun main() {
    var sc= Scanner(System.`in`);
    var t:Int= sc.nextInt();
    while(t-->0) {
        var n:Int= sc.nextInt();
        var max:Int= Int.MIN_VALUE;
        while(n-->1) {
            max=Math.max(max, sc.nextInt())
        }
        if(sc.nextInt()- max==1) {
            println(max)
        } else {
            println("Ambiguous")
        }
    }
}