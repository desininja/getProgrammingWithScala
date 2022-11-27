import scala.io.Source
import java.sql.{Date => SqlDate}
def readFileIntoString (filename:String)=
  Source.fromFile(filename).getLines().mkString("\n")