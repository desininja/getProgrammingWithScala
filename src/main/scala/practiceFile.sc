abstract class Robot(val name:String="Unknown"){
  def welcome(n:String): Unit ={
    println(s"Welcome $n! My name is $name")
  }
}

class italianRobot(name:String) extends Robot(name){
  override def welcome(n: String) = println(s"Benvenuto $n! Il mio nome e' $name")
}

class englishRobot(name:String, country:String) extends Robot(name){
  override def welcome(n: String) =  println(s"Welcome $n, I am $name from the country of $country!")
}

class myRobot(name:String) extends Robot(name){

}
val italianRobot = new italianRobot("viktor")
val englishRobot = new englishRobot(name="John",country = "England")
val dd = new myRobot("yuhi")
italianRobot.welcome("Himanshu")
englishRobot.welcome("Himanshu")
dd.welcome("jj")