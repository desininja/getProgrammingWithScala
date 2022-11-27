class Robot(val name:String="Unknown"){
  def welcome(n:String): Unit ={
    println(s"Welcome $n! My name is $name")
  }
}

val tom = new Robot("Tom")
val john = new Robot("John")
val noName = new Robot

tom.welcome("Martin")
john.welcome("Himanshu")
noName.welcome("Laila")




//Create a class Person with a name of type
// String and an age of type Int—defaulted
// to 0.
// Define a method called presentYourself,
// for the class Person; it takes no parameters,
// and it returns a string to communicate the
// name and age of a person. Create two
// instances and see what the presentYourself
// method returns for each of them: Martin is
// 18, and Bob is 0 years old.

abstract class Person(name:String, age:Int=0){
  def presentYourself()={
    println(s"Hi my name is $name and I am $age")
  }
  def hello(n: String): String
}

val case1 = new Person(name="Martin",age=18) {
  override def hello(n: String) = ???
}
val case2 = new Person(name="Bob", age =0) {
  override def hello(n: String) = ???
}

case1.presentYourself()
case2.presentYourself()
///////////////////////////////////////

class italianRobot(name:String) extends Robot(name){
  override def welcome(n: String) = println(s"Benvenuto $n! Il mio nome e' $name")
}

class englishRobot(name:String, country:String) extends Robot(name){
  override def welcome(n: String) =  println(s"Welcome $n, I am $name from the country of $country!")
}

val italianRobot = new italianRobot("viktor")
val englishRobot = new englishRobot(name="John",country = "England")

italianRobot.welcome("Himanshu")
englishRobot.welcome("Himanshu")


abstract class teacher(name:String, age:Int=0) extends Person(name,age){

  override def presentYourself()=
  {println(s"Hi my name is $name and I am $age. I am a teacher")}

}

abstract class student(name:String, age:Int=0, ID:Int) extends Person(name, age){

  override def presentYourself()={
    println(s"Hi my name is $name and I am $age. I am a student. My ID is $ID")
  }
}

val teacher = new teacher("Poorima Kapoor",age=45) {
  override def hello(n: String) = ???
}
val student = new student(name="Himanshu Bhatt",age=24,ID=6) {
  override def hello(n: String) = ???
}

teacher.presentYourself()
student.presentYourself()






