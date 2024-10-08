import java.util.Scanner

fun main(args: Array<String>) {
    val sc= Scanner(System.`in`)
    var t:Int= sc.nextInt()
    while(t-->0) {
        var a:Int = sc.nextInt()
        var b:Int = sc.nextInt()
        if (a>b) {
            println("$b $a")
        } else {
            println("$a $b")
        }
    }
}