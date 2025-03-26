import java.util.Scanner

fun main() {
    var read= Scanner(System.`in`)

    println("Enter number:")
    var c=read.nextInt()
    println("Enter number:")
    var f=read.nextInt()
    println("Enter operator:")
    var assign=read.next()

    var result=when(assign){
        "+"->c+f
        "/"->c/f
        "-"->c-f
        "*"->c*f
        "%"->c%f
        else ->"Invalid operator"
    }
    println("The result is $result")

}