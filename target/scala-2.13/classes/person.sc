class person(name:String, age:Int){
  def welcome()={ println(s"Hi my name is $name and I am $age years old.")}
}


class teacher(name:String, age:Int) extends person(name, age){
  override def welcome()={println(s"Hi I am Teacher by profession, my name is $name and I am $age years old.")}
}

class student(name:String,age:Int, ID:String) extends person(name, age){
  override def welcome()= {println(s"Hi I am a student, my name is $name and I am $age years old.")}
}

val p = new person("person example", 23)
val t = new teacher("Poornima Kapoor",56)
val s = new student("Himanshu", 26,"IP")

p.welcome()
t.welcome()
s.welcome()