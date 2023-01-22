val name = "Scala"

val a = "Word"

//Here attendees is public variable and it
//can be accessed easily which can compromise
//the security of an Application
class Party {
  var attendees = 0
  def guests(n:Int)={
    attendees += n
  }
}


//using private keyword can limit the access of
// attendees variable.

class Party_private{
  private var attendees = 0

  def guest(n:Int)= {
    attendees += n
  }}

// private access modifier is used to prevent
//access to functions, variables, classes.

class Test {
  val configA = "I am Public"
  private val configB = "I am Private"
}

val test = new Test

test.configA

//test.configB

class Person {
  private val age = 18
}

class Student extends Person

val stu = new Student
stu.age


/*
REFRESH KNOWLEDGE ON EXTENDS
 */












