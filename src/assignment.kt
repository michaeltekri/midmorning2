import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    println("Enter number:")

    var first= read.nextInt()
    println("$first is first number")
    var second= read.nextInt()
    println("$second is second number")
    var third= read.nextInt()
    println("$third is third number")



    if (first>second && first>third){
        println("$first is the largest number")
    }
    else if (second>first && second>third){
        println("$second is the largest number")
    }
    else{
        println("$third is the largest number")
    }













}
