import java.util.Scanner

fun main(args: Array<String>) {
    val sc= Scanner(System.`in`)
    var t:Int= sc.nextInt()
    while(t-->0) {
        var n:Double= sc.nextDouble()
        if(Math.sqrt(n)==(Int)Math.sqrt(n)) {
            println("Square")
        } else {
            println("not Square")
        }
    }
}