import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    println("Enter number:")

    var d= read.nextInt()
    println("$d is first number")
    var a= read.nextInt()
    println("$a is first number")
    var c= read.nextInt()
    println("$c is first number")

    var max= listOf(d,a,c).max()
    println("$max is greatest number")














}
