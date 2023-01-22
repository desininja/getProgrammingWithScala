class Person(val name:String, val age:Int) {
  def welcome()= {
             println(s"Hi my name is $name, my age is $age")
  }

}

object Person{
  var person = new Person("Person_example",90)
  var t = new teacher("Poornima Kapoor", age=56)
  var s = new student("Himanshu Bhatt",26,"06")
  person.welcome()
  t.welcome()
  s.welcome()
}

