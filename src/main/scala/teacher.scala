class teacher(name:String, age:Int) extends Person (name,age){
  override def welcome()={
    println(s"Hi I am a teacher, my name is $name and my age is $age")
  }

}
