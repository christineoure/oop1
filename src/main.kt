fun main(){
   var human = Humans("Santana",22,70)
   human.eat(2)
    human.speak("English")
    human.birhtday()
    var bro= Bro("Ashley","Amelea","ashleyamelea@gmail.com","0725032022","Akirachix01")
    println(bro.firstname)
    println(bro.secondname)



}
//creating a data class that has attributes and performs different functions
data class Humans(var name:String,var age: Int, var weight: Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating ${foodWeight} kgs of food")
    }
    //printing the string passed to the function
    fun speak(speech:String){
        println(speech)
    }
    // Increasing the age by one
    fun birhtday(){
        println(age+1)
    }
}
//creating a data class user that prints out any two attributes
data class Bro(var firstname:String, var secondname:String, var email:String, var phonenumber:String, var password:String)
