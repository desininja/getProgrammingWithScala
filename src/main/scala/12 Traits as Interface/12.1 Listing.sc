trait Animal{

  def sleep = "Zzz"

  def eat(food:String):String

  def move(x:Int, y:Int):String
}

class Cat extends Animal{

  override val sleep = "Sleepy Cat!"

  def eat(food:String) = s"The Cat is eating $food"

  def move(x:Int,y:Int) = s"The Cat is moving to $x $y"
}