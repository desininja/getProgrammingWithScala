import scala.io.Source

def readFileIntoSring(filename: String)={
  val content = Source.fromFile(filename).getLines().mkString("\n")
  content
}

readFileIntoSring("/home/himanshu/Downloads/getProgrammingWithScala/src/main/scala/text.txt")