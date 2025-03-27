//parent class/superclass/baseclass
open class Animal{
    var age=3
    var gender="male"

    fun makesound(){
        println("Animal is speaking")
    }
}

//child class/derived class/subclass
class dog:Animal(){
    fun bark(){
        println("Woof! Woof!")
    }
}
class Cat{
    var color="White"
    var hasFur=true
    fun meow(){
        println("Meow! Meow!")
    }
}

fun main() {
    var a=Animal()

    var d=dog()

    var c=Cat()
}