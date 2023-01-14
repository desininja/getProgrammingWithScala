

abstract class Robot(name:String="Unknown"){
  def welcome(n:String)
}


class italianRobot(name:String) extends Robot(name){
  override def welcome(n: String) = println(s"Benvenuto $n! Il mio nome e' $name")
}

class myRobot(name:String) extends Robot(name){

}