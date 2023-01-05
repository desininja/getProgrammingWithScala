class student (name:String, age:Int, ID:String) extends Person (name, age){
  override def welcome()={
    println(s"Hi I am a student and my name is $name and I am $age years old.")
  }

}
