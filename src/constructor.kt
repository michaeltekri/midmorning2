fun main() {
    var dog1=Dog("Billy","Chihuahua","brown")
    println(dog1.name)
    var dog2=Dog("Mike","Kienyeji","brown")
    println(dog2.name)
    var dog3=Dog("Joseph","German shepherd","brown")
    var dog4=Dog("Ian","Siberian husky","white")
}
class Dog(var name:String,var breed:String,var color:String){

}