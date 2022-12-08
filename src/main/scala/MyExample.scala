import scala.io.Source

class MyExample {

  def readFileIntoString (filename:String) =
    Source.fromFile(filename).getLines().mkString("\n")

}
//function can only live inside a class or singleton object,