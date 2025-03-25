

fun main() {
    //while loop
    var number = 20
    while (number <= 25) {
        println("Number is $number")
        number++
    }

    var num=5
    while(num>=1){
        println("The number is $num")
        num--
    }
    //do while loop
    var count=100
    do{
        println("Count is $count")
        count++
    }
        while(count<=105)

        //For loop
        for(x in 35..40){
            println("Number: $x")
        }

    for(letter in 'a'..'d'){
        println("Letter is $letter")
    }
    //break
    for(a in 1..5){
        if (a==3){
            break
        }
        println("Number is $a")
    }
    //continue
    for (myletter in 'd'..'h'){
        if (myletter == 'f'){
            continue
        }
        println("My letter is $myletter")
    }
}